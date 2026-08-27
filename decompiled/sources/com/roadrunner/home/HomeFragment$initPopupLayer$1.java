package com.roadrunner.home;

import androidx.compose.ui.graphics.Fields;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.createFromParcel;
import o.ddefault;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class HomeFragment$initPopupLayer$1 extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeFragment$initPopupLayer$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.read = i3;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            String str = (String) obj;
            ddefault ddefaultVar = (ddefault) obj2;
            int iIntValue = ((Number) obj3).intValue();
            str.getClass();
            ddefaultVar.getClass();
            ((HomeFragment) this.MediaMetadataCompat).RemoteActionCompatParcelizer(str, ddefaultVar, iIntValue);
            return createfromparcel;
        }
        if (i4 == 1) {
            String str2 = (String) obj;
            ddefault ddefaultVar2 = (ddefault) obj2;
            int iIntValue2 = ((Number) obj3).intValue();
            str2.getClass();
            ddefaultVar2.getClass();
            ((HomeFragment) this.MediaMetadataCompat).RemoteActionCompatParcelizer(str2, ddefaultVar2, iIntValue2);
            int i5 = IconCompatParcelizer + 17;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return createfromparcel;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        if (i4 == 2) {
            String str3 = (String) obj;
            ddefault ddefaultVar3 = (ddefault) obj2;
            int iIntValue3 = ((Number) obj3).intValue();
            str3.getClass();
            ddefaultVar3.getClass();
            ((HomeFragment) this.MediaMetadataCompat).RemoteActionCompatParcelizer(str3, ddefaultVar3, iIntValue3);
            return createfromparcel;
        }
        if (i4 != 3) {
            String str4 = (String) obj;
            ddefault ddefaultVar4 = (ddefault) obj2;
            int iIntValue4 = ((Number) obj3).intValue();
            str4.getClass();
            ddefaultVar4.getClass();
            ((HomeFragment) this.MediaMetadataCompat).RemoteActionCompatParcelizer(str4, ddefaultVar4, iIntValue4);
            return createfromparcel;
        }
        String str5 = (String) obj;
        ddefault ddefaultVar5 = (ddefault) obj2;
        int iIntValue5 = ((Number) obj3).intValue();
        str5.getClass();
        ddefaultVar5.getClass();
        ((HomeFragment) this.MediaMetadataCompat).RemoteActionCompatParcelizer(str5, ddefaultVar5, iIntValue5);
        return createfromparcel;
    }
}
