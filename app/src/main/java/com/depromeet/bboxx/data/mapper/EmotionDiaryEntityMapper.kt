package com.depromeet.bboxx.data.mapper

import com.depromeet.bboxx.data.entity.EmotionDiaryEntity
import com.depromeet.bboxx.domain.model.EmotionDiary
import javax.inject.Inject

class EmotionDiaryEntityMapper @Inject constructor(
    private val emotionStatusEntityMapper: EmotionStatusEntityMapper
) {
    fun trans(target: EmotionDiaryEntity): EmotionDiary = with(target) {
        return EmotionDiary(
            categoryId,
            content,
            createdAt,
            emotionStatusEntityMapper.transList(emotionStatusList),
            id,
            memberId,
            title,
            updateAt
        )
    }
}