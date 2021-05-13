package com.hs.s1.board;

import java.util.List;

public interface BoardService {

//	getList==============================================
	public List<BoardVO> getList() throws Exception;
	
//	getSelect==============================================
	public BoardVO getSelect(BoardVO boardVO) throws Exception;
	
//	setInsert==============================================
	public Integer setInsert(BoardVO boardVO) throws Exception;
	
//	setUpdate==============================================
	public Integer setUpdate(BoardVO boardVO) throws Exception;
	
//	setDelete==============================================
	public Integer setDelete(BoardVO boardVO) throws Exception;
}
