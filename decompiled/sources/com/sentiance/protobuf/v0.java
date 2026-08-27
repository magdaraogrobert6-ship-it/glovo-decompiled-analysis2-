package com.sentiance.protobuf;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.Map;
import o.BrazeViewBounds;
import o.CardKey;
import o.DelayedInitializationAnalyticsBehavior;
import o.GeofenceTransitionType;
import o.IValueCallback;
import o.ImageStyle;
import o.accessgetCardTypeMapcp;
import o.accessgetDiskCacheLockp;
import o.accessisOfflinep;
import o.fromStringlambda1;
import o.getServerKeyFromCardType;
import o.getTriggerEvent;
import o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY;
import o.r8lambdaHxndgEp3NZAe65egvieVRgKrMSA;
import o.r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig;
import o.setRuntimeAppConfigurationProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements fromStringlambda1 {
    public final r8lambdaHxndgEp3NZAe65egvieVRgKrMSA RemoteActionCompatParcelizer;
    public final accessgetDiskCacheLockp read;
    public final boolean serializer;
    public final c1 write;

    @Override // o.fromStringlambda1
    public final int IconCompatParcelizer(GeneratedMessageLite generatedMessageLite) {
        ((getTriggerEvent) this.write).getClass();
        int iHashCode = generatedMessageLite.serializer.hashCode();
        return this.serializer ? ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.serializer.hashCode() + (iHashCode * 53) : iHashCode;
    }

    @Override // o.fromStringlambda1
    public final void IconCompatParcelizer(Object obj) {
        ((getTriggerEvent) this.write).getClass();
        IValueCallback iValueCallback = ((GeneratedMessageLite) obj).serializer;
        if (iValueCallback.MediaDescriptionCompat) {
            iValueCallback.MediaDescriptionCompat = false;
        }
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.MediaDescriptionCompat();
    }

    @Override // o.fromStringlambda1
    public final int read(GeneratedMessageLite generatedMessageLite) {
        ((getTriggerEvent) this.write).getClass();
        IValueCallback iValueCallback = generatedMessageLite.serializer;
        int i = iValueCallback.RemoteActionCompatParcelizer;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < iValueCallback.IconCompatParcelizer; i3++) {
                int i4 = iValueCallback.serializer[i3];
                ByteString byteString = (ByteString) iValueCallback.read[i3];
                int iSerializer = setRuntimeAppConfigurationProvider.serializer(1);
                int iSerializer2 = setRuntimeAppConfigurationProvider.serializer(2);
                int i5 = setRuntimeAppConfigurationProvider.read(i4 >>> 3);
                int iSerializer3 = setRuntimeAppConfigurationProvider.serializer(3);
                int iSerializer4 = byteString.serializer();
                i2 += setRuntimeAppConfigurationProvider.read(iSerializer4) + iSerializer4 + iSerializer3 + i5 + iSerializer2 + (iSerializer * 2);
            }
            iValueCallback.RemoteActionCompatParcelizer = i2;
            i = i2;
        }
        return this.serializer ? ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.write() + i : i;
    }

    public v0(c1 c1Var, r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa, accessgetDiskCacheLockp accessgetdiskcachelockp) {
        this.write = c1Var;
        this.serializer = accessgetdiskcachelockp instanceof GeneratedMessageLite.ExtendableMessage;
        this.RemoteActionCompatParcelizer = r8lambdahxndgep3nzae65egvievrgkrmsa;
        this.read = accessgetdiskcachelockp;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6 A[EDGE_INSN: B:53:0x00c6->B:36:0x00c6 BREAK  A[LOOP:1: B:18:0x0070->B:35:0x00c4], SYNTHETIC] */
    @Override // o.fromStringlambda1
    public final void RemoteActionCompatParcelizer(Object obj, byte[] bArr, int i, int i2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        IValueCallback iValueCallback = generatedMessageLite.serializer;
        if (iValueCallback == IValueCallback.write) {
            iValueCallback = new IValueCallback();
            generatedMessageLite.serializer = iValueCallback;
        }
        IValueCallback iValueCallback2 = iValueCallback;
        ImageStyle imageStyleEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        int iRemoteActionCompatParcelizer = i;
        getServerKeyFromCardType getserverkeyfromcardtypeSerializer = null;
        while (iRemoteActionCompatParcelizer < i2) {
            int iIconCompatParcelizer = j.IconCompatParcelizer(bArr, iRemoteActionCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
            int i3 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
            DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior = (DelayedInitializationAnalyticsBehavior) r8lambdacyuxafptvn7drfel1dgtevxcy.IconCompatParcelizer;
            accessgetDiskCacheLockp accessgetdiskcachelockp = this.read;
            int i4 = 2;
            if (i3 == 11) {
                int i5 = 0;
                ByteString byteString = null;
                while (iIconCompatParcelizer < i2) {
                    iIconCompatParcelizer = j.IconCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    int i6 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != i4) {
                        if (i7 == 3) {
                            if (getserverkeyfromcardtypeSerializer != null) {
                                iIconCompatParcelizer = j.read(BrazeViewBounds.read.read(getserverkeyfromcardtypeSerializer.serializer.getClass()), bArr, iIconCompatParcelizer, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                                imageStyleEnsureExtensionsAreMutable.RemoteActionCompatParcelizer(getserverkeyfromcardtypeSerializer.IconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy.read);
                            } else if (i8 == 2) {
                                iIconCompatParcelizer = j.write(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                                byteString = (ByteString) r8lambdacyuxafptvn7drfel1dgtevxcy.read;
                            } else if (i6 == 12) {
                                break;
                            } else {
                                iIconCompatParcelizer = j.RemoteActionCompatParcelizer(i6, bArr, iIconCompatParcelizer, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                            }
                        } else {
                            if (i6 == 12) {
                                break;
                                break;
                            }
                            iIconCompatParcelizer = j.RemoteActionCompatParcelizer(i6, bArr, iIconCompatParcelizer, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        }
                    } else if (i8 == 0) {
                        int iIconCompatParcelizer2 = j.IconCompatParcelizer(bArr, iIconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        int i9 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                        iIconCompatParcelizer = iIconCompatParcelizer2;
                        i5 = i9;
                        getserverkeyfromcardtypeSerializer = delayedInitializationAnalyticsBehavior.serializer(i9, accessgetdiskcachelockp);
                    } else {
                        if (i6 == 12) {
                            break;
                            break;
                        }
                        iIconCompatParcelizer = j.RemoteActionCompatParcelizer(i6, bArr, iIconCompatParcelizer, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    }
                    i4 = 2;
                }
                if (byteString != null) {
                    iValueCallback2.write((i5 << 3) | 2, byteString);
                }
                iRemoteActionCompatParcelizer = iIconCompatParcelizer;
            } else if ((i3 & 7) == 2) {
                getServerKeyFromCardType getserverkeyfromcardtypeSerializer2 = delayedInitializationAnalyticsBehavior.serializer(i3 >>> 3, accessgetdiskcachelockp);
                if (getserverkeyfromcardtypeSerializer2 != null) {
                    iRemoteActionCompatParcelizer = j.read(BrazeViewBounds.read.read(getserverkeyfromcardtypeSerializer2.serializer.getClass()), bArr, iIconCompatParcelizer, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    imageStyleEnsureExtensionsAreMutable.RemoteActionCompatParcelizer(getserverkeyfromcardtypeSerializer2.IconCompatParcelizer, r8lambdacyuxafptvn7drfel1dgtevxcy.read);
                } else {
                    iRemoteActionCompatParcelizer = j.RemoteActionCompatParcelizer(i3, bArr, iIconCompatParcelizer, i2, iValueCallback2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                getserverkeyfromcardtypeSerializer = getserverkeyfromcardtypeSerializer2;
            } else {
                iRemoteActionCompatParcelizer = j.RemoteActionCompatParcelizer(i3, bArr, iIconCompatParcelizer, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            }
        }
        if (iRemoteActionCompatParcelizer != i2) {
            throw InvalidProtocolBufferException.RatingCompat();
        }
    }

    @Override // o.fromStringlambda1
    public final boolean read(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        getTriggerEvent gettriggerevent = (getTriggerEvent) this.write;
        gettriggerevent.getClass();
        IValueCallback iValueCallback = generatedMessageLite.serializer;
        gettriggerevent.getClass();
        if (!iValueCallback.equals(generatedMessageLite2.serializer)) {
            return false;
        }
        if (this.serializer) {
            return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
        }
        return true;
    }

    @Override // o.fromStringlambda1
    public final void read(Object obj, accessisOfflinep accessisofflinep) {
        Iterator itRemoteActionCompatParcelizer = ((GeneratedMessageLite.ExtendableMessage) obj).extensions.RemoteActionCompatParcelizer();
        while (itRemoteActionCompatParcelizer.hasNext()) {
            Map.Entry entry = (Map.Entry) itRemoteActionCompatParcelizer.next();
            accessgetCardTypeMapcp accessgetcardtypemapcp = (accessgetCardTypeMapcp) entry.getKey();
            if (accessgetcardtypemapcp.read.getJavaType() == WireFormat$JavaType.MESSAGE && !accessgetcardtypemapcp.IconCompatParcelizer && !accessgetcardtypemapcp.serializer) {
                accessisofflinep.RemoteActionCompatParcelizer(accessgetcardtypemapcp.RemoteActionCompatParcelizer, entry.getValue());
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Found invalid MessageSet item.");
                return;
            }
        }
        ((getTriggerEvent) this.write).getClass();
        IValueCallback iValueCallback = ((GeneratedMessageLite) obj).serializer;
        iValueCallback.getClass();
        accessisofflinep.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int i = iValueCallback.IconCompatParcelizer - 1; i >= 0; i--) {
                accessisofflinep.RemoteActionCompatParcelizer(iValueCallback.serializer[i] >>> 3, iValueCallback.read[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < iValueCallback.IconCompatParcelizer; i2++) {
            accessisofflinep.RemoteActionCompatParcelizer(iValueCallback.serializer[i2] >>> 3, iValueCallback.read[i2]);
        }
    }

    @Override // o.fromStringlambda1
    public final boolean serializer(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions.serializer();
    }

    public final boolean write(v vVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa, ImageStyle imageStyle, c1 c1Var, IValueCallback iValueCallback) throws InvalidProtocolBufferException {
        int i = vVar.serializer;
        accessgetDiskCacheLockp accessgetdiskcachelockp = this.read;
        if (i != 11) {
            if ((i & 7) == 2) {
                getServerKeyFromCardType getserverkeyfromcardtypeSerializer = delayedInitializationAnalyticsBehavior.serializer(i >>> 3, accessgetdiskcachelockp);
                if (getserverkeyfromcardtypeSerializer != null) {
                    imageStyle.RemoteActionCompatParcelizer(getserverkeyfromcardtypeSerializer.IconCompatParcelizer, vVar.write(getserverkeyfromcardtypeSerializer.serializer.getClass(), delayedInitializationAnalyticsBehavior));
                    return true;
                }
                return c1Var.serializer(0, vVar, iValueCallback);
            }
            return vVar.RemoteActionCompatParcelizer();
        }
        getServerKeyFromCardType getserverkeyfromcardtypeSerializer2 = null;
        ByteString byteStringSerializer = null;
        int iSerializer = 0;
        while (vVar.read() != Integer.MAX_VALUE) {
            int i2 = vVar.serializer;
            if (i2 == 16) {
                vVar.write(0);
                iSerializer = vVar.read.serializer();
                getserverkeyfromcardtypeSerializer2 = delayedInitializationAnalyticsBehavior.serializer(iSerializer, accessgetdiskcachelockp);
            } else if (i2 == 26) {
                if (getserverkeyfromcardtypeSerializer2 != null) {
                    imageStyle.RemoteActionCompatParcelizer(getserverkeyfromcardtypeSerializer2.IconCompatParcelizer, vVar.write(getserverkeyfromcardtypeSerializer2.serializer.getClass(), delayedInitializationAnalyticsBehavior));
                } else {
                    byteStringSerializer = vVar.serializer();
                }
            } else if (!vVar.RemoteActionCompatParcelizer()) {
                break;
            }
        }
        if (vVar.serializer != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (byteStringSerializer != null) {
            if (getserverkeyfromcardtypeSerializer2 != null) {
                r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig r8lambdaxy_za9fysiz3bnvgpaidnjd_aigNewBuilderForType = getserverkeyfromcardtypeSerializer2.serializer.newBuilderForType();
                u uVarRemoteActionCompatParcelizer = byteStringSerializer.RemoteActionCompatParcelizer();
                CardKey cardKey = (CardKey) r8lambdaxy_za9fysiz3bnvgpaidnjd_aigNewBuilderForType;
                cardKey.write(uVarRemoteActionCompatParcelizer, delayedInitializationAnalyticsBehavior);
                imageStyle.RemoteActionCompatParcelizer(getserverkeyfromcardtypeSerializer2.IconCompatParcelizer, cardKey.IconCompatParcelizer());
                uVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(0);
                return true;
            }
            ((getTriggerEvent) c1Var).getClass();
            iValueCallback.write((iSerializer << 3) | 2, byteStringSerializer);
        }
        return true;
    }

    @Override // o.fromStringlambda1
    public final void write(Object obj, Object obj2) {
        GeofenceTransitionType.write(this.write, obj, obj2);
        if (this.serializer) {
            ImageStyle imageStyle = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
            if (imageStyle.serializer.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable().read(imageStyle);
        }
    }

    @Override // o.fromStringlambda1
    public final GeneratedMessageLite serializer() {
        accessgetDiskCacheLockp accessgetdiskcachelockp = this.read;
        if (accessgetdiskcachelockp instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) accessgetdiskcachelockp).newMutableInstance();
        }
        return ((CardKey) accessgetdiskcachelockp.newBuilderForType()).IconCompatParcelizer();
    }

    @Override // o.fromStringlambda1
    public final void write(Object obj, v vVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa = this.RemoteActionCompatParcelizer;
        c1 c1Var = this.write;
        IValueCallback iValueCallbackWrite = c1Var.write(obj);
        ImageStyle imageStyleEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (vVar.read() != Integer.MAX_VALUE) {
            try {
                if (!write(vVar, delayedInitializationAnalyticsBehavior, r8lambdahxndgep3nzae65egvievrgkrmsa, imageStyleEnsureExtensionsAreMutable, c1Var, iValueCallbackWrite)) {
                    return;
                }
            } finally {
                ((GeneratedMessageLite) obj).serializer = iValueCallbackWrite;
            }
        }
    }
}
