package o;

import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public final class removeOnNewIntentListener implements getOnBackPressedDispatcher {
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity serializer;

    @Override // o.getOnBackPressedDispatcher
    public final void write(androidx.activity.ComponentActivity componentActivity) {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.serializer;
        removeOnPictureInPictureModeChangedListener delegate = appCompatActivity.getDelegate();
        startActivityForResult startactivityforresult = (startActivityForResult) delegate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(startactivityforresult.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(startactivityforresult);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        appCompatActivity.getSavedStateRegistry().write("androidx:appcompat");
        delegate.write();
    }

    public removeOnNewIntentListener(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.serializer = appCompatActivity;
    }
}
