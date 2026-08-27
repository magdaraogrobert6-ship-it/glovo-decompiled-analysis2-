package com.roadrunner.rider.state.worksettings.presentation;

import androidx.compose.ui.graphics.Fields;
import o.createFromParcel;
import o.getOriginatingPackageName;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.removePushToken;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SettingsInfoBottomSheet$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ SettingsInfoBottomSheet RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ SettingsInfoBottomSheet$$ExternalSyntheticLambda1(SettingsInfoBottomSheet settingsInfoBottomSheet, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = settingsInfoBottomSheet;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.write;
        SettingsInfoBottomSheet settingsInfoBottomSheet = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            ((getOriginatingPackageName) settingsInfoBottomSheet.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper()).read.RemoteActionCompatParcelizer(removePushToken.RemoteActionCompatParcelizer);
            return createFromParcel.INSTANCE;
        }
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = settingsInfoBottomSheet.getSavedStateRegistry;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i4 = serializer + 73;
        int i5 = i4 % Fields.SpotShadowColor;
        IconCompatParcelizer = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 67;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 56 / 0;
        }
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }
}
