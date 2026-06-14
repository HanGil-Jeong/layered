package com.sparta.layered.repository;

import com.sparta.layered.dto.MemoResponseDto;
import com.sparta.layered.entity.Memo;

import java.util.List;

public interface MemoRepository {

	Memo saveMemo(Memo memo);
	List<MemoResponseDto> findAllMemos();
	Memo findMemoById(Long id);
	void deleteMemo(Long id);
}
