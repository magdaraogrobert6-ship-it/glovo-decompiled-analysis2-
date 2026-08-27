package org.bouncycastle.asn1;

import androidx.compose.ui.graphics.Fields;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.subjects.BehaviorSubject;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import o.DeliveryInfoCompanion;
import o.Lab;
import o.ProvidernetworkModule1;
import o.UrlBuilderKt;
import o.absRcpResponse;
import o.configureStrokePaintho4zsrM;
import o.drawImage9jGpkUE;
import o.drawImagegbVJVH8;
import o.getBackendNamecustomerchat_release;
import o.getMoshiConverter;
import o.logErrordefault;
import o.obtainFillPaint;
import o.onViewAdded;
import o.onViewRemoved;
import o.provideRequest;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ASN1UniversalType implements absRcpResponse, drawImagegbVJVH8 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int MediaMetadataCompat;
    public Object RatingCompat;

    public abstract Single IconCompatParcelizer(Object obj);

    public /* synthetic */ ASN1UniversalType(int i, Object obj) {
        this.MediaMetadataCompat = i;
        this.RatingCompat = obj;
    }

    @Override // o.absRcpResponse
    public List serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (List) this.RatingCompat;
        }
        throw null;
    }

    public provideRequest fromByteArray(byte[] bArr) throws IOException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            provideRequest providerequestRemoteActionCompatParcelizer = provideRequest.RemoteActionCompatParcelizer(bArr);
            checkedCast(providerequestRemoteActionCompatParcelizer);
            return providerequestRemoteActionCompatParcelizer;
        }
        provideRequest providerequestRemoteActionCompatParcelizer2 = provideRequest.RemoteActionCompatParcelizer(bArr);
        checkedCast(providerequestRemoteActionCompatParcelizer2);
        int i3 = 90 / 0;
        return providerequestRemoteActionCompatParcelizer2;
    }

    public provideRequest fromImplicitConstructed(ProvidernetworkModule1 providernetworkModule1) {
        int i = 2 % 2;
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public provideRequest fromImplicitPrimitive(UrlBuilderKt urlBuilderKt) {
        int i = 2 % 2;
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    @Override // o.drawImagegbVJVH8
    public drawImage9jGpkUE IconCompatParcelizer(MultiModelLoaderFactory multiModelLoaderFactory) {
        int i = 2 % 2;
        obtainFillPaint obtainfillpaint = new obtainFillPaint(0, (configureStrokePaintho4zsrM) this.RatingCompat);
        int i2 = IconCompatParcelizer + 71;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return obtainfillpaint;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this.MediaMetadataCompat != 0) {
            boolean zEquals = super.equals(obj);
            int i2 = IconCompatParcelizer + 121;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return zEquals;
            }
            throw null;
        }
        if (this != obj) {
            return false;
        }
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 117;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = i3 + 99;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 4 % 5;
        }
        return true;
    }

    public void checkedCast(provideRequest providerequest) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((Class) this.RatingCompat).isInstance(providerequest)) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected object: ".concat(providerequest.getClass().getName()));
        int i4 = IconCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    @Override // o.absRcpResponse
    public boolean IconCompatParcelizer() {
        int i = 2 % 2;
        List list = (List) this.RatingCompat;
        if (!list.isEmpty()) {
            int i2 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0 ? list.size() == 1 : list.size() == 0) {
                if (((Lab) list.get(0)).RemoteActionCompatParcelizer()) {
                    int i3 = IconCompatParcelizer + 3;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.MediaMetadataCompat != 1) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        List list = (List) this.RatingCompat;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
            int i4 = IconCompatParcelizer + 113;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return sb.toString();
    }

    public BehaviorSubject serializer(Object obj) {
        int i = 2 % 2;
        BehaviorSubject behaviorSubjectIconCompatParcelizer = BehaviorSubject.IconCompatParcelizer(new onViewAdded(0));
        Single singleIconCompatParcelizer = IconCompatParcelizer(obj);
        Scheduler scheduler = (Scheduler) this.RatingCompat;
        new SingleObserveOn(singleIconCompatParcelizer.write(scheduler), scheduler).subscribe(new RetryWithDelay$$ExternalSyntheticLambda1(19, new onViewRemoved(behaviorSubjectIconCompatParcelizer, 0)), new RetryWithDelay$$ExternalSyntheticLambda1(20, new onViewRemoved(behaviorSubjectIconCompatParcelizer, 1)));
        int i2 = RemoteActionCompatParcelizer + 91;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return behaviorSubjectIconCompatParcelizer;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[PHI: r8
  0x003d: PHI (r8v5 o.provideRequest) = (r8v4 o.provideRequest), (r8v15 o.provideRequest) binds: [B:16:0x003b, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[PHI: r8
  0x0060: PHI (r8v12 o.provideRequest) = (r8v4 o.provideRequest), (r8v15 o.provideRequest) binds: [B:16:0x003b, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    public provideRequest getContextInstance(getBackendNamecustomerchat_release getbackendnamecustomerchat_release, boolean z) {
        provideRequest providerequestRatingCompat;
        provideRequest providerequestFromImplicitPrimitive;
        int i;
        int i2;
        ProvidernetworkModule1 getmoshiconverter;
        int i3 = 2 % 2;
        ASN1Util.read(getbackendnamecustomerchat_release);
        int i4 = getbackendnamecustomerchat_release.IconCompatParcelizer;
        logErrordefault logerrordefault = getbackendnamecustomerchat_release.serializer;
        int i5 = 1;
        if (z) {
            if (!getbackendnamecustomerchat_release.RemoteActionCompatParcelizer()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("object explicit - implicit expected.");
                return null;
            }
            providerequestFromImplicitPrimitive = logerrordefault.RatingCompat();
            checkedCast(providerequestFromImplicitPrimitive);
        } else {
            if (1 == i4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("object explicit - implicit expected.");
                return null;
            }
            int i6 = IconCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                providerequestRatingCompat = logerrordefault.RatingCompat();
                if (i4 != 3) {
                    providerequestFromImplicitPrimitive = providerequestRatingCompat;
                    if (i4 != 4) {
                        checkedCast(providerequestFromImplicitPrimitive);
                    } else if (providerequestFromImplicitPrimitive instanceof ProvidernetworkModule1) {
                        providerequestFromImplicitPrimitive = fromImplicitConstructed((ProvidernetworkModule1) providerequestFromImplicitPrimitive);
                        i = IconCompatParcelizer + 39;
                    } else {
                        providerequestFromImplicitPrimitive = fromImplicitPrimitive((UrlBuilderKt) providerequestFromImplicitPrimitive);
                    }
                } else {
                    i2 = getbackendnamecustomerchat_release.write;
                    if (i2 != 0) {
                        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(providerequestRatingCompat, 0);
                        deliveryInfoCompanion.serializer = -1;
                        getmoshiconverter = deliveryInfoCompanion;
                    } else if (i2 != 1) {
                        DeliveryInfoCompanion deliveryInfoCompanion2 = new DeliveryInfoCompanion(providerequestRatingCompat, i5);
                        deliveryInfoCompanion2.serializer = -1;
                        getmoshiconverter = deliveryInfoCompanion2;
                    } else {
                        getmoshiconverter = new getMoshiConverter(providerequestRatingCompat);
                    }
                    providerequestFromImplicitPrimitive = fromImplicitConstructed(getmoshiconverter);
                    i = IconCompatParcelizer + 117;
                }
                RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                int i7 = i % 2;
            } else {
                providerequestRatingCompat = logerrordefault.RatingCompat();
                if (i4 != 3) {
                    providerequestFromImplicitPrimitive = providerequestRatingCompat;
                    if (i4 != 4) {
                        checkedCast(providerequestFromImplicitPrimitive);
                    } else if (providerequestFromImplicitPrimitive instanceof ProvidernetworkModule1) {
                        providerequestFromImplicitPrimitive = fromImplicitConstructed((ProvidernetworkModule1) providerequestFromImplicitPrimitive);
                        i = IconCompatParcelizer + 39;
                    } else {
                        providerequestFromImplicitPrimitive = fromImplicitPrimitive((UrlBuilderKt) providerequestFromImplicitPrimitive);
                    }
                } else {
                    i2 = getbackendnamecustomerchat_release.write;
                    if (i2 != 0) {
                        DeliveryInfoCompanion deliveryInfoCompanion3 = new DeliveryInfoCompanion(providerequestRatingCompat, 0);
                        deliveryInfoCompanion3.serializer = -1;
                        getmoshiconverter = deliveryInfoCompanion3;
                    } else if (i2 != 1) {
                        DeliveryInfoCompanion deliveryInfoCompanion4 = new DeliveryInfoCompanion(providerequestRatingCompat, i5);
                        deliveryInfoCompanion4.serializer = -1;
                        getmoshiconverter = deliveryInfoCompanion4;
                    } else {
                        getmoshiconverter = new getMoshiConverter(providerequestRatingCompat);
                    }
                    providerequestFromImplicitPrimitive = fromImplicitConstructed(getmoshiconverter);
                    i = IconCompatParcelizer + 117;
                }
                RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                int i8 = i % 2;
            }
        }
        checkedCast(providerequestFromImplicitPrimitive);
        return providerequestFromImplicitPrimitive;
    }
}
