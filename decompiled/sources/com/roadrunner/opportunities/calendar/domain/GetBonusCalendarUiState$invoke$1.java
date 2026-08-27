package com.roadrunner.opportunities.calendar.domain;

import androidx.compose.ui.graphics.Fields;
import com.airbnb.lottie.parser.DropShadowEffect;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetBonusCalendarUiState$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public String RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ DropShadowEffect serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBonusCalendarUiState$invoke$1(DropShadowEffect dropShadowEffect, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = dropShadowEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 89;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4008invokeBWLJW6A = this.serializer.m4008invokeBWLJW6A(null, 0, null, this);
        if (objM4008invokeBWLJW6A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4008invokeBWLJW6A);
        }
        int i4 = MediaBrowserCompatMediaItem;
        int i5 = i4 + 5;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 49;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 18 / 0;
        }
        return objM4008invokeBWLJW6A;
    }
}
