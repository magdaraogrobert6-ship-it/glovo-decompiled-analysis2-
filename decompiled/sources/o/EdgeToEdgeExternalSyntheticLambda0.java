package o;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public class EdgeToEdgeExternalSyntheticLambda0 extends androidx.activity.ComponentDialog implements removeOnMultiWindowModeChangedListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static byte read = -112;
    private static int write;
    public final invoke IconCompatParcelizer;
    public startActivityForResult serializer;

    public final boolean RemoteActionCompatParcelizer(int i) {
        return write().serializer(1);
    }

    @Override // o.removeOnMultiWindowModeChangedListener
    public final void onSupportActionModeFinished(handleOnBackPressed handleonbackpressed) {
    }

    @Override // o.removeOnMultiWindowModeChangedListener
    public final void onSupportActionModeStarted(handleOnBackPressed handleonbackpressed) {
    }

    @Override // o.removeOnMultiWindowModeChangedListener
    public final handleOnBackPressed onWindowStartingSupportActionMode(handleOnBackStarted handleonbackstarted) {
        return null;
    }

    public final boolean serializer(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        startActivityForResult startactivityforresult = (startActivityForResult) write();
        startactivityforresult.ensureSubDecor();
        ((ViewGroup) startactivityforresult.addMenuProvider.findViewById(android.R.id.content)).addView(view, layoutParams);
        startactivityforresult.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(startactivityforresult.getLastCustomNonConfigurationInstance.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        write().IconCompatParcelizer();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStop() {
        super.onStop();
        startActivityForResult startactivityforresult = (startActivityForResult) write();
        startactivityforresult.serializer();
        onTrimMemory ontrimmemory = startactivityforresult.PlaybackStateCompatCustomAction;
        if (ontrimmemory != null) {
            ontrimmemory.write(false);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        write().RemoteActionCompatParcelizer(i);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        getWindow().getDecorView();
        return r8lambdamYEtK3wDOqF6c3HLWu9wJc3oPw.RemoteActionCompatParcelizer(this.IconCompatParcelizer, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        startActivityForResult startactivityforresult = (startActivityForResult) write();
        startactivityforresult.ensureSubDecor();
        return startactivityforresult.getLastCustomNonConfigurationInstance.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        write().read();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        startActivityForResult startactivityforresult = (startActivityForResult) write();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(startactivityforresult.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(startactivityforresult);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        write().write();
    }

    public final removeOnPictureInPictureModeChangedListener write() {
        if (this.serializer == null) {
            getDifferencertfAjoo getdifferencertfajoo = removeOnPictureInPictureModeChangedListener.RatingCompat;
            this.serializer = new startActivityForResult(getContext(), getWindow(), this, this);
        }
        return this.serializer;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [o.invoke] */
    public EdgeToEdgeExternalSyntheticLambda0(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.logistics.rider.glovo.R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.IconCompatParcelizer = new setFocusRect() { // from class: o.invoke
            @Override // o.setFocusRect
            public final boolean superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
                return this.IconCompatParcelizer.serializer(keyEvent);
            }
        };
        removeOnPictureInPictureModeChangedListener removeonpictureinpicturemodechangedlistenerWrite = write();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(com.logistics.rider.glovo.R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((startActivityForResult) removeonpictureinpicturemodechangedlistenerWrite).addOnTrimMemoryListener = i;
        removeonpictureinpicturemodechangedlistenerWrite.write();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        write().serializer(view);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        write().serializer(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        int i2 = 2 % 2;
        super.setTitle(i);
        removeOnPictureInPictureModeChangedListener removeonpictureinpicturemodechangedlistenerWrite = write();
        String string = getContext().getString(i);
        if (string.startsWith("%('")) {
            int i3 = write + 65;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        removeonpictureinpicturemodechangedlistenerWrite.read(string);
        int i5 = write + 37;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        write().read(charSequence);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
