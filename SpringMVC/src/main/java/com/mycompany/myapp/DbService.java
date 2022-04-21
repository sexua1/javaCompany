package com.mycompany.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//로직
@Service
@Transactional //예외발생 롤백처리 / 특징 원자성 / 트렌젝션 공부
public class DbService {
  @Autowired 
  private dbMapper mapper;
  
  public DbVo fetchDb(int id) throws Exception {
    DbVo db = mapper.fetchDb(id);
    return db;
  }
}
