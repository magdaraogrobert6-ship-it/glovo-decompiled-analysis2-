package com.deliveryhero.fwf_client.model;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoParserKt {

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.model.ProtoParserKt$decodeProtoAndCache$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProtoParserKt.decodeProtoAndCache(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00de  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:32:0x0130  */
    /* JADX WARN: Code duplicated, block: B:36:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f4 -> B:34:0x0138). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0130 -> B:33:0x0134). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object decodeProtoAndCache(final byte[] r16, com.deliveryhero.fwf_cache.MemoryCache r17, final com.deliveryhero.fwf_logger.ILogger r18, final com.deliveryhero.fwf_util.FwFSerializer r19, final com.deliveryhero.fwf_metrics.MetricProvider r20, o.ShortNewsContentCardView<? super com.deliveryhero.fwf_client.model.DecodeResult> r21) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.fwf_client.model.ProtoParserKt.decodeProtoAndCache(byte[], com.deliveryhero.fwf_cache.MemoryCache, com.deliveryhero.fwf_logger.ILogger, com.deliveryhero.fwf_util.FwFSerializer, com.deliveryhero.fwf_metrics.MetricProvider, o.ShortNewsContentCardView):java.lang.Object");
    }
}
