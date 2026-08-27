package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class Channel$Factory {
    public static final /* synthetic */ Channel$Factory write = new Channel$Factory();
    public static final int serializer = (int) SystemPropsKt.write("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);
}
