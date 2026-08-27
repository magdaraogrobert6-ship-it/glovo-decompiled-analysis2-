package com.roadrunner.rider.recruitment.accountcreation.presentation;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import o.AndroidUiFrameClock;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AccountCreationFragment$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ AccountCreationFragment read;

    public /* synthetic */ AccountCreationFragment$$ExternalSyntheticLambda0(AccountCreationFragment accountCreationFragment, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = accountCreationFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        AccountCreationFragment accountCreationFragment = this.read;
        String string = null;
        if (i2 == 0) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = accountCreationFragment.getOnBackPressedDispatcher;
            if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
                removeNodeAtDepth.serializer("accountCreationFragmentViewModelFactory");
                throw null;
            }
            int i3 = serializer + 39;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return r8lambdaudhhxliolpu0hpccqh6voskpny;
            }
            string.hashCode();
            throw null;
        }
        if (i2 == 1) {
            Bundle arguments = accountCreationFragment.getArguments();
            if (arguments != null) {
                int i4 = serializer + 13;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    arguments.getString("result_code");
                    throw null;
                }
                string = arguments.getString("result_code");
            }
            return string == null ? "" : string;
        }
        if (i2 == 2) {
            Bundle arguments2 = accountCreationFragment.getArguments();
            if (arguments2 != null) {
                int i5 = serializer + 71;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    arguments2.getString("phone_number");
                    string.hashCode();
                    throw null;
                }
                string = arguments2.getString("phone_number");
            }
            return string == null ? "" : string;
        }
        if (i2 == 3) {
            Bundle arguments3 = accountCreationFragment.getArguments();
            if (arguments3 != null) {
                int i6 = IconCompatParcelizer + 41;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                string = arguments3.getString("original_message_id");
            }
            if (string == null) {
                return "";
            }
            int i8 = serializer + 119;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return string;
        }
        if (i2 == 4) {
            Bundle arguments4 = accountCreationFragment.getArguments();
            return Integer.valueOf(arguments4 != null ? arguments4.getInt("retry_count", 0) : 0);
        }
        if (i2 == 5) {
            accountCreationFragment.read(false, false);
            return createfromparcel;
        }
        AndroidUiFrameClock androidUiFrameClock = accountCreationFragment.getSavedStateRegistry;
        if (androidUiFrameClock == null) {
            removeNodeAtDepth.serializer("loginNavigator");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = accountCreationFragment.requireActivity();
        fragmentActivityRequireActivity.getClass();
        Intent intentAddFlags = androidUiFrameClock.serializer(fragmentActivityRequireActivity).addFlags(268468224);
        intentAddFlags.getClass();
        fragmentActivityRequireActivity.startActivity(intentAddFlags);
        return createfromparcel;
    }
}
