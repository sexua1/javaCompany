package com.mycompany.myapp;

import org.apache.ibatis.annotations.Mapper;

//맵퍼 레퍼지토리 차이
@Mapper
public interface dbMapper {
  public DbVo fetchDb(int id) throws Exception;
}
