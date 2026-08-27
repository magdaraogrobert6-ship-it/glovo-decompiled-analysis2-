package o;

/* JADX INFO: loaded from: classes3.dex */
public final class findData {
    private static int read = 1;
    private static int write;
    public final createClocklambda0 IconCompatParcelizer;
    public final setInitialStateToCurrentAnimationValue RemoteActionCompatParcelizer;

    public findData(setInitialStateToCurrentAnimationValue setinitialstatetocurrentanimationvalue, createClocklambda0 createclocklambda0) {
        setinitialstatetocurrentanimationvalue.getClass();
        createclocklambda0.getClass();
        this.RemoteActionCompatParcelizer = setinitialstatetocurrentanimationvalue;
        this.IconCompatParcelizer = createclocklambda0;
    }

    public static void serializer(safeSetClipToOutline safesetcliptooutline, Enum r4, Object obj) {
        int i = 2 % 2;
        if (obj != null) {
            int i2 = write + 87;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            safesetcliptooutline.put(r4, obj);
        }
        int i4 = read + 3;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final ConstraintsKt RemoteActionCompatParcelizer(FontSynthesis_androidKt fontSynthesis_androidKt) {
        mapTreeWithStitching maptreewithstitching;
        int i = 2 % 2;
        int i2 = read + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strRemoteActionCompatParcelizer = fontSynthesis_androidKt.RemoteActionCompatParcelizer();
        preloadlambda1 preloadlambda1Var = fontSynthesis_androidKt.read();
        ComposeAnimationState composeAnimationStateSerializer = null;
        if (preloadlambda1Var != null) {
            maptreewithstitching = this.IconCompatParcelizer.read(preloadlambda1Var);
            int i4 = write + 67;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            maptreewithstitching = null;
        }
        getDismissOnBackPress getdismissonbackpressSerializer = fontSynthesis_androidKt.serializer();
        if (getdismissonbackpressSerializer != null) {
            int i6 = read + 101;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                composeAnimationStateSerializer = this.RemoteActionCompatParcelizer.serializer(getdismissonbackpressSerializer);
                int i7 = 6 / 0;
            } else {
                composeAnimationStateSerializer = this.RemoteActionCompatParcelizer.serializer(getdismissonbackpressSerializer);
            }
        }
        return new ConstraintsKt(strRemoteActionCompatParcelizer, maptreewithstitching, composeAnimationStateSerializer, fontSynthesis_androidKt.write());
    }

    public final constrainWidthK40F9xA read(FontVariation fontVariation) {
        getNoopState getnoopstateWrite;
        int i = 2 % 2;
        int i2 = read + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = fontVariation.serializer();
        getWindowTitle getwindowtitleRemoteActionCompatParcelizer = fontVariation.RemoteActionCompatParcelizer();
        if (getwindowtitleRemoteActionCompatParcelizer != null) {
            int i4 = read + 115;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                this.RemoteActionCompatParcelizer.getClass();
                getnoopstateWrite = setInitialStateToCurrentAnimationValue.write(getwindowtitleRemoteActionCompatParcelizer);
                int i5 = 96 / 0;
            } else {
                this.RemoteActionCompatParcelizer.getClass();
                getnoopstateWrite = setInitialStateToCurrentAnimationValue.write(getwindowtitleRemoteActionCompatParcelizer);
            }
        } else {
            getnoopstateWrite = null;
        }
        return new constrainWidthK40F9xA(strSerializer, getnoopstateWrite);
    }
}
