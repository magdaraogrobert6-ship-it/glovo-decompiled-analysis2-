package o;

import com.roadrunner.delivery.state.pudo.TagIconTokenV1;

/* JADX INFO: loaded from: classes3.dex */
public final class createClocklambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final setInitialStateToCurrentAnimationValue serializer;
    public final AndroidUiFrameClock write;

    public createClocklambda0(AndroidUiFrameClock androidUiFrameClock, setInitialStateToCurrentAnimationValue setinitialstatetocurrentanimationvalue) {
        androidUiFrameClock.getClass();
        setinitialstatetocurrentanimationvalue.getClass();
        this.write = androidUiFrameClock;
        this.serializer = setinitialstatetocurrentanimationvalue;
    }

    public final mapTreeWithStitching read(preloadlambda1 preloadlambda1Var) {
        Integer numIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ComposeAnimationState composeAnimationStateSerializer = null;
        if (i2 % 2 != 0) {
            preloadlambda1Var.getClass();
            preloadlambda1Var.IconCompatParcelizer();
            throw null;
        }
        preloadlambda1Var.getClass();
        TagIconTokenV1 tagIconTokenV1IconCompatParcelizer = preloadlambda1Var.IconCompatParcelizer();
        if (tagIconTokenV1IconCompatParcelizer != null) {
            this.write.getClass();
            numIconCompatParcelizer = AndroidUiFrameClock.IconCompatParcelizer(tagIconTokenV1IconCompatParcelizer);
        } else {
            numIconCompatParcelizer = null;
        }
        String str = preloadlambda1Var.read();
        String strSerializer = preloadlambda1Var.serializer();
        getDismissOnBackPress getdismissonbackpressRemoteActionCompatParcelizer = preloadlambda1Var.RemoteActionCompatParcelizer();
        if (getdismissonbackpressRemoteActionCompatParcelizer != null) {
            int i3 = RemoteActionCompatParcelizer + 85;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                this.serializer.serializer(getdismissonbackpressRemoteActionCompatParcelizer);
                throw null;
            }
            composeAnimationStateSerializer = this.serializer.serializer(getdismissonbackpressRemoteActionCompatParcelizer);
        }
        mapTreeWithStitching maptreewithstitching = new mapTreeWithStitching(numIconCompatParcelizer, str, strSerializer, composeAnimationStateSerializer, preloadlambda1Var.write());
        int i4 = IconCompatParcelizer + 33;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return maptreewithstitching;
    }
}
