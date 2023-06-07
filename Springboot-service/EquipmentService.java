package com.Li.service;

import com.Li.pojo.Equipment;

import java.util.List;

public interface EquipmentService {

    //查询所有器械
    List<Equipment> findAll();

    //根据id删除器械
    Boolean deleteByEquipmentId(Integer equipmentId);

    //添加器材
    Boolean insertEquipment(Equipment equipment);

    //根据id修改器械信息
    Boolean updateEquipmentByEquipmentId(Equipment equipment);

    //根据id查询器械
    List<Equipment> selectByEquipmentId(Integer equipmentId);

    //查询器械总数
    Integer selectTotalCount();

}