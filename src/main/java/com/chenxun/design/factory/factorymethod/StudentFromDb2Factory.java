package com.chenxun.design.factory.factorymethod;

import com.chenxun.design.factory.student.IStudent;
import com.chenxun.design.factory.student.StudentFromDb2;

/** 
 * @author：chenxun
 * createDate：2016年11月5日 下午8:10:49 
 * Theme:
 * reference:
 * descript:
 */
public class StudentFromDb2Factory implements IStudentFactory {

	@Override
	public IStudent getStudent() {
		return new StudentFromDb2();
	}

}