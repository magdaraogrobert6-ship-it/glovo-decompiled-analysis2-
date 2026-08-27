package com.mapbox.base.common.logger;

import com.mapbox.base.common.logger.model.Message;
import com.mapbox.base.common.logger.model.Tag;

/* JADX INFO: loaded from: classes5.dex */
public interface Logger {
    void d(Tag tag, Message message, Throwable th);

    void e(Tag tag, Message message, Throwable th);

    void i(Tag tag, Message message, Throwable th);

    void w(Tag tag, Message message, Throwable th);
}
