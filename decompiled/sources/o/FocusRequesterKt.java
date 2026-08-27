package o;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat$Impl;

/* JADX INFO: loaded from: classes.dex */
public class FocusRequesterKt extends FocusRequesterModifier {
    public final WindowInsets.Builder serializer;

    @Override // o.FocusRequesterModifier
    public void IconCompatParcelizer(setRight setright) {
        this.serializer.setStableInsets(setright.bt_());
    }

    @Override // o.FocusRequesterModifier
    public void RemoteActionCompatParcelizer(setRight setright) {
        this.serializer.setTappableElementInsets(setright.bt_());
    }

    @Override // o.FocusRequesterModifier
    public void read(setRight setright) {
        this.serializer.setSystemGestureInsets(setright.bt_());
    }

    @Override // o.FocusRequesterModifier
    public void serializer(setRight setright) {
        this.serializer.setMandatorySystemGestureInsets(setright.bt_());
    }

    @Override // o.FocusRequesterModifier
    public void write(setRight setright) {
        this.serializer.setSystemWindowInsets(setright.bt_());
    }

    public FocusRequesterKt(FocusRequesterModifierKt focusRequesterModifierKt) {
        super(focusRequesterModifierKt);
        WindowInsets windowInsetsIconCompatParcelizer = focusRequesterModifierKt.IconCompatParcelizer();
        this.serializer = windowInsetsIconCompatParcelizer != null ? getFocusOrderReceiver.by_(windowInsetsIconCompatParcelizer) : FocusRequesterModifierDefaultImpls.cb_();
    }

    @Override // o.FocusRequesterModifier
    public FocusRequesterModifierKt RemoteActionCompatParcelizer() {
        serializer();
        FocusRequesterModifierKt focusRequesterModifierKtWrite = FocusRequesterModifierKt.write(null, this.serializer.build());
        setRight[] setrightArr = this.read;
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKtWrite.IconCompatParcelizer;
        windowInsetsCompat$Impl.setOverriddenInsets(setrightArr);
        windowInsetsCompat$Impl.setDisplayShape(null);
        windowInsetsCompat$Impl.setTypeBoundingRectsMap(this.RemoteActionCompatParcelizer);
        windowInsetsCompat$Impl.setTypeMaxBoundingRectsMap(this.IconCompatParcelizer);
        return focusRequesterModifierKtWrite;
    }

    public FocusRequesterKt() {
        this.serializer = FocusRequesterModifierDefaultImpls.cb_();
    }
}
