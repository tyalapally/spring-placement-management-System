package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class JobService {
 
    @Autowired
    private JobRepository repo;
     
    public List<Job> listAll() {
        return repo.findAll();
    }
     
    public void save(Job job) {
        repo.save(job);
    }
     
    public Job get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
