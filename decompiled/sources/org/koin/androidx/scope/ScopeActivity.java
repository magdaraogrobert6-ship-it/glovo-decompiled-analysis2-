package org.koin.androidx.scope;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.FwFClientbootstrapIfNeeded1;
import o.evaluateFeaturesfwf_client_release;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ScopeActivity extends AppCompatActivity implements evaluateFeaturesfwf_client_release {
    private final onViewDetachedFromWindowlambda1 MediaDescriptionCompat;

    @Override // o.evaluateFeaturesfwf_client_release
    public Scope write() {
        return (Scope) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (write() != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
    }

    public ScopeActivity(int i) {
        super(i);
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new FwFClientbootstrapIfNeeded1(17, this));
    }

    public /* synthetic */ ScopeActivity(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public ScopeActivity() {
        this(0, 1, null);
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
