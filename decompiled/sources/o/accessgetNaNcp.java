package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetNaNcp extends accessgetNegativeInfinitycp {
    public int MediaSessionCompatResultReceiverWrapper;
    public FocusOrderModifierDefaultImpls[] PlaybackStateCompat;
    public String PlaybackStateCompatCustomAction;

    public FocusOrderModifierDefaultImpls[] getPathData() {
        return this.PlaybackStateCompat;
    }

    public String getPathName() {
        return this.PlaybackStateCompatCustomAction;
    }

    public accessgetNaNcp(accessgetNaNcp accessgetnancp) {
        this.PlaybackStateCompat = null;
        this.MediaSessionCompatResultReceiverWrapper = 0;
        this.PlaybackStateCompatCustomAction = accessgetnancp.PlaybackStateCompatCustomAction;
        FocusOrderModifierDefaultImpls[] focusOrderModifierDefaultImplsArr = accessgetnancp.PlaybackStateCompat;
        FocusOrderModifierDefaultImpls[] focusOrderModifierDefaultImplsArr2 = new FocusOrderModifierDefaultImpls[focusOrderModifierDefaultImplsArr.length];
        for (int i = 0; i < focusOrderModifierDefaultImplsArr.length; i++) {
            focusOrderModifierDefaultImplsArr2[i] = new FocusOrderModifierDefaultImpls(focusOrderModifierDefaultImplsArr[i]);
        }
        this.PlaybackStateCompat = focusOrderModifierDefaultImplsArr2;
    }

    public void setPathData(FocusOrderModifierDefaultImpls[] focusOrderModifierDefaultImplsArr) {
        FocusOrderModifierDefaultImpls[] focusOrderModifierDefaultImplsArr2 = this.PlaybackStateCompat;
        if (focusOrderModifierDefaultImplsArr2 != null && focusOrderModifierDefaultImplsArr != null && focusOrderModifierDefaultImplsArr2.length == focusOrderModifierDefaultImplsArr.length) {
            int i = 0;
            while (true) {
                if (i >= focusOrderModifierDefaultImplsArr2.length) {
                    FocusOrderModifierDefaultImpls[] focusOrderModifierDefaultImplsArr3 = this.PlaybackStateCompat;
                    for (int i2 = 0; i2 < focusOrderModifierDefaultImplsArr.length; i2++) {
                        focusOrderModifierDefaultImplsArr3[i2].IconCompatParcelizer = focusOrderModifierDefaultImplsArr[i2].IconCompatParcelizer;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = focusOrderModifierDefaultImplsArr[i2].write;
                            if (i3 < fArr.length) {
                                focusOrderModifierDefaultImplsArr3[i2].write[i3] = fArr[i3];
                                i3++;
                            }
                        }
                    }
                    return;
                }
                FocusOrderModifierDefaultImpls focusOrderModifierDefaultImpls = focusOrderModifierDefaultImplsArr2[i];
                char c = focusOrderModifierDefaultImpls.IconCompatParcelizer;
                FocusOrderModifierDefaultImpls focusOrderModifierDefaultImpls2 = focusOrderModifierDefaultImplsArr[i];
                if (c != focusOrderModifierDefaultImpls2.IconCompatParcelizer || focusOrderModifierDefaultImpls.write.length != focusOrderModifierDefaultImpls2.write.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        FocusOrderModifierDefaultImpls[] focusOrderModifierDefaultImplsArr4 = new FocusOrderModifierDefaultImpls[focusOrderModifierDefaultImplsArr.length];
        for (int i4 = 0; i4 < focusOrderModifierDefaultImplsArr.length; i4++) {
            focusOrderModifierDefaultImplsArr4[i4] = new FocusOrderModifierDefaultImpls(focusOrderModifierDefaultImplsArr[i4]);
        }
        this.PlaybackStateCompat = focusOrderModifierDefaultImplsArr4;
    }

    public accessgetNaNcp() {
        this.PlaybackStateCompat = null;
        this.MediaSessionCompatResultReceiverWrapper = 0;
    }
}
