package com.depromeet.bboxx.data.repository.notice

import com.depromeet.bboxx.data.entity.NotificationTokenEntity
import com.depromeet.bboxx.data.entity.NotificationsEntity
import io.reactivex.rxjava3.core.Single

interface NoticeDataSource {
    fun getNotificationList(): Single<List<NotificationsEntity>>

    fun getNotificationInfo(ownerId: Int): Single<NotificationTokenEntity>

    fun deRegisterNotification(ownerId: Int): Single<NotificationsEntity>

    fun registerNotification(ownerId: Int, token: String): Single<NotificationsEntity>
}