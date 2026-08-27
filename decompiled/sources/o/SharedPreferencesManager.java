package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SharedPreferencesManager implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    public /* synthetic */ SharedPreferencesManager(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.IconCompatParcelizer = 0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    public /* synthetic */ SharedPreferencesManager(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i) {
        this.IconCompatParcelizer = i;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.read;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.write;
        Object obj2 = null;
        if (i4 == 0) {
            sendNextSdkClick sendnextsdkclick = (sendNextSdkClick) obj;
            sendnextsdkclick.getClass();
            if (sendnextsdkclick.equals(SdkClickHandler3.write)) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                return createfromparcel;
            }
            if (!(sendnextsdkclick instanceof sendNextSdkClickI)) {
                if (sendnextsdkclick instanceof SdkClickHandler4) {
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((SdkClickHandler4) sendnextsdkclick).serializer, ddefault.IconCompatParcelizer, 0);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i5 = MediaDescriptionCompat + 23;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((sendNextSdkClickI) sendnextsdkclick).serializer);
                return createfromparcel;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((sendNextSdkClickI) sendnextsdkclick).serializer);
            int i6 = 43 / 0;
            return createfromparcel;
        }
        if (i4 == 1) {
            getUrlAnnotationSaverannotations geturlannotationsaverannotations = (getUrlAnnotationSaverannotations) obj;
            geturlannotationsaverannotations.getClass();
            if (geturlannotationsaverannotations instanceof SaversKtExternalSyntheticLambda7) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((SaversKtExternalSyntheticLambda7) geturlannotationsaverannotations).serializer);
                return createfromparcel;
            }
            if (!(!(geturlannotationsaverannotations instanceof getTextLinkStylesSaver))) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                return createfromparcel;
            }
            if (!(geturlannotationsaverannotations instanceof SaversKtColorSaver1)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            SaversKtColorSaver1 saversKtColorSaver1 = (SaversKtColorSaver1) geturlannotationsaverannotations;
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(saversKtColorSaver1.serializer, saversKtColorSaver1.read, -1);
            return createfromparcel;
        }
        if (i4 == 2) {
            clearCompatExtraKeys clearcompatextrakeys = (clearCompatExtraKeys) obj;
            clearcompatextrakeys.getClass();
            if (clearcompatextrakeys.equals(getClassName.IconCompatParcelizer)) {
                int i7 = MediaDescriptionCompat + 107;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(null);
                return createfromparcel;
            }
            if (clearcompatextrakeys.equals(buildIntoRemoteViews.serializer)) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                return createfromparcel;
            }
            if (!(clearcompatextrakeys instanceof displayCustomViewInline)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((displayCustomViewInline) clearcompatextrakeys).serializer, ddefault.IconCompatParcelizer, -1);
            return createfromparcel;
        }
        if (i4 == 3) {
            setStoreAppId setstoreappid = (setStoreAppId) obj;
            setstoreappid.getClass();
            if (setstoreappid instanceof addPartnerSharingSetting) {
                int i9 = MediaDescriptionCompat + 103;
                RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(null);
                return createfromparcel;
            }
            if (setstoreappid instanceof addGranularOption) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                return createfromparcel;
            }
            if (!(setstoreappid instanceof getGranularOptions)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((getGranularOptions) setstoreappid).read, ddefault.IconCompatParcelizer, -1);
            return createfromparcel;
        }
        getAndroidId getandroidid = (getAndroidId) obj;
        getandroidid.getClass();
        if (getandroidid instanceof checkAttributionResponseI) {
            int i11 = RemoteActionCompatParcelizer + 5;
            MediaDescriptionCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(null);
                return createfromparcel;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(null);
            obj2.hashCode();
            throw null;
        }
        if (getandroidid instanceof checkDeeplinkInAttributionResponseI) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return createfromparcel;
        }
        if (!(getandroidid instanceof checkAttributionI)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i12 = MediaDescriptionCompat + 51;
        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((checkAttributionI) getandroidid).read, ddefault.IconCompatParcelizer, -1);
        return createfromparcel;
    }
}
