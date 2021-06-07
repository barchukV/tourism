package com.example.tourism.service.diary.impls;

import com.example.tourism.model.Diary;
import com.example.tourism.repository.DiaryRepository;
import com.example.tourism.service.diary.interfaces.IDiaryService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class DiaryServiceImpl implements IDiaryService {
    final DiaryRepository repository;

    public DiaryServiceImpl(DiaryRepository diaryRepository) {
        this.repository = diaryRepository;
    }


    @Override
    public Diary getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Diary create(Diary diary) {
        return repository.save(diary);
    }

    @Override
    public Diary update(Diary diary) {
        return repository.save(diary);
    }

    @Override
    public Diary delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Diary> getAll() {
        return repository.findAll();
    }
}
