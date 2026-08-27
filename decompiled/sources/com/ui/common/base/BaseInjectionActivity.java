package com.ui.common.base;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseInjectionActivity extends AppCompatActivity implements convertStringJsonArrayToList {

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public constructJsonArray _init_lambda1;

    @Override // o.convertStringJsonArrayToList
    public r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        removeNodeAtDepth.write(this);
        super.onCreate(bundle);
    }

    public final constructJsonArray r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        constructJsonArray constructjsonarray = this._init_lambda1;
        if (constructjsonarray != null) {
            return constructjsonarray;
        }
        removeNodeAtDepth.serializer("androidInjector");
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
