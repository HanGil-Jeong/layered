package com.sparta.layered.repository;

import com.sparta.layered.dto.MemoResponseDto;
import com.sparta.layered.entity.Memo;

import java.util.List;
import java.util.Optional;

public interface MemoRepository {

	MemoResponseDto saveMemo(Memo memo);

	List<MemoResponseDto> findAllMemos();

	Optional<Memo> findMemoById(Long id);

	Memo findMemoByIdOrElseThrow(Long id);

	int updateMemo(Long id, String title, String contents);

	int updateTitle(Long id, String title);

	int deleteMemo(Long id);
}
