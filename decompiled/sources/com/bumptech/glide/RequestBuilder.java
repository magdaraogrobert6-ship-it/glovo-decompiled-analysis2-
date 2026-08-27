package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.request.SingleRequest;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.Fill;
import o.ImageKt;
import o.Oklab;
import o.RenderIntentCompanion;
import o.accessemitEnter;
import o.accessgetApparentToRealOffsetnOccac;
import o.accessgetPerceptualcp;
import o.getAbsoluteuksYyKA;
import o.getEndXimpl;
import o.insetdefault;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.rotateRadRg1IO4c;
import o.rotateRadRg1IO4cdefault;
import o.rotateRg1IO4c;
import o.rotateRg1IO4cdefault;
import o.scaleFgt4K4Q;
import o.scaleFgt4K4Qdefault;

/* JADX INFO: loaded from: classes.dex */
public final class RequestBuilder extends insetdefault {
    public boolean IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public RequestBuilder MediaDescriptionCompat;
    public ArrayList MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Oklab ParcelableVolumeInfo;
    public final Class PlaybackStateCompatCustomAction;
    public final RequestManager RatingCompat;
    public final Context RemoteActionCompatParcelizer;
    public RequestBuilder read;
    public final accessgetPerceptualcp serializer;
    public final boolean write = true;

    static {
    }

    @Override // o.insetdefault
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final RequestBuilder write(insetdefault insetdefaultVar) {
        UrlUtils.read(insetdefaultVar);
        return (RequestBuilder) super.write(insetdefaultVar);
    }

    public final void write(rotateRadRg1IO4cdefault rotateradrg1io4cdefault) {
        UrlUtils.read(rotateradrg1io4cdefault);
        if (!this.IconCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("You must call #load() before calling #into()");
            return;
        }
        rotateRg1IO4c rotaterg1io4cIconCompatParcelizer = IconCompatParcelizer(new Object(), rotateradrg1io4cdefault, null, this.ParcelableVolumeInfo, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, this);
        rotateRg1IO4c rotaterg1io4c = rotateradrg1io4cdefault.MediaDescriptionCompat;
        if (rotaterg1io4cIconCompatParcelizer.IconCompatParcelizer(rotaterg1io4c) && (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus || !rotaterg1io4c.MediaBrowserCompatMediaItem())) {
            UrlUtils.serializer(rotaterg1io4c, "Argument must not be null");
            if (rotaterg1io4c.MediaMetadataCompat()) {
                return;
            }
            rotaterg1io4c.RemoteActionCompatParcelizer();
            return;
        }
        this.RatingCompat.read(rotateradrg1io4cdefault);
        rotateradrg1io4cdefault.MediaDescriptionCompat = rotaterg1io4cIconCompatParcelizer;
        RequestManager requestManager = this.RatingCompat;
        synchronized (requestManager) {
            requestManager.MediaMetadataCompat.IconCompatParcelizer.add(rotateradrg1io4cdefault);
            accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = requestManager.MediaDescriptionCompat;
            ((Set) accessgetapparenttorealoffsetnoccac.serializer).add(rotaterg1io4cIconCompatParcelizer);
            if (accessgetapparenttorealoffsetnoccac.read) {
                rotaterg1io4cIconCompatParcelizer.write();
                Log.isLoggable("RequestTracker", 2);
                ((HashSet) accessgetapparenttorealoffsetnoccac.write).add(rotaterg1io4cIconCompatParcelizer);
            } else {
                rotaterg1io4cIconCompatParcelizer.RemoteActionCompatParcelizer();
            }
        }
    }

    public RequestBuilder(Glide glide, RequestManager requestManager, Class cls, Context context) {
        scaleFgt4K4Qdefault scalefgt4k4qdefault;
        this.RatingCompat = requestManager;
        this.PlaybackStateCompatCustomAction = cls;
        this.RemoteActionCompatParcelizer = context;
        ImageKt imageKt = requestManager.MediaSessionCompatQueueItem.RatingCompat.MediaSessionCompatQueueItem;
        Oklab oklab = (Oklab) imageKt.get(cls);
        if (oklab == null) {
            for (Map.Entry entry : (accessemitEnter) imageKt.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    oklab = (Oklab) entry.getValue();
                }
            }
        }
        this.ParcelableVolumeInfo = oklab == null ? accessgetPerceptualcp.read : oklab;
        this.serializer = glide.RatingCompat;
        Iterator it = requestManager.write.iterator();
        while (it.hasNext()) {
            serializer((getEndXimpl) it.next());
        }
        synchronized (requestManager) {
            scalefgt4k4qdefault = requestManager.MediaBrowserCompatMediaItem;
        }
        write(scalefgt4k4qdefault);
    }

    @Override // o.insetdefault
    public final boolean equals(Object obj) {
        if (!(obj instanceof RequestBuilder)) {
            return false;
        }
        RequestBuilder requestBuilder = (RequestBuilder) obj;
        return super.equals(requestBuilder) && Objects.equals(this.PlaybackStateCompatCustomAction, requestBuilder.PlaybackStateCompatCustomAction) && this.ParcelableVolumeInfo.equals(requestBuilder.ParcelableVolumeInfo) && Objects.equals(this.MediaSessionCompatQueueItem, requestBuilder.MediaSessionCompatQueueItem) && Objects.equals(this.MediaMetadataCompat, requestBuilder.MediaMetadataCompat) && Objects.equals(this.MediaDescriptionCompat, requestBuilder.MediaDescriptionCompat) && Objects.equals(this.read, requestBuilder.read) && this.write == requestBuilder.write && this.IconCompatParcelizer == requestBuilder.IconCompatParcelizer;
    }

    @Override // o.insetdefault
    public final int hashCode() {
        return Fill.serializer(this.IconCompatParcelizer ? 1 : 0, Fill.serializer(this.write ? 1 : 0, Fill.write(Fill.write(Fill.write(Fill.write(Fill.write(Fill.write(Fill.write(super.hashCode(), this.PlaybackStateCompatCustomAction), this.ParcelableVolumeInfo), this.MediaSessionCompatQueueItem), this.MediaMetadataCompat), this.MediaDescriptionCompat), this.read), null)));
    }

    @Override // o.insetdefault
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final RequestBuilder clone() {
        RequestBuilder requestBuilder = (RequestBuilder) super.clone();
        requestBuilder.ParcelableVolumeInfo = requestBuilder.ParcelableVolumeInfo.clone();
        ArrayList arrayList = requestBuilder.MediaMetadataCompat;
        if (arrayList != null) {
            requestBuilder.MediaMetadataCompat = new ArrayList(arrayList);
        }
        RequestBuilder requestBuilder2 = requestBuilder.MediaDescriptionCompat;
        if (requestBuilder2 != null) {
            requestBuilder.MediaDescriptionCompat = requestBuilder2.clone();
        }
        RequestBuilder requestBuilder3 = requestBuilder.read;
        if (requestBuilder3 != null) {
            requestBuilder.read = requestBuilder3.clone();
        }
        return requestBuilder;
    }

    public final RequestBuilder read(Object obj) {
        if (this.PlaybackStateCompat) {
            return clone().read(obj);
        }
        this.MediaSessionCompatQueueItem = obj;
        this.IconCompatParcelizer = true;
        write();
        return this;
    }

    public final RequestBuilder serializer(getEndXimpl getendximpl) {
        if (this.PlaybackStateCompat) {
            return clone().serializer(getendximpl);
        }
        if (getendximpl != null) {
            if (this.MediaMetadataCompat == null) {
                this.MediaMetadataCompat = new ArrayList();
            }
            this.MediaMetadataCompat.add(getendximpl);
        }
        write();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final rotateRg1IO4c IconCompatParcelizer(Object obj, rotateRadRg1IO4cdefault rotateradrg1io4cdefault, rotateRadRg1IO4c rotateradrg1io4c, Oklab oklab, RenderIntentCompanion renderIntentCompanion, int i, int i2, insetdefault insetdefaultVar) {
        rotateRadRg1IO4c rotateradrg1io4c2;
        rotateRadRg1IO4c rotaterg1io4cdefault;
        rotateRg1IO4c singleRequest;
        int i3;
        int i4;
        RenderIntentCompanion renderIntentCompanion2;
        int i5;
        int i6;
        if (this.read != null) {
            rotaterg1io4cdefault = new rotateRg1IO4cdefault(obj, rotateradrg1io4c);
            rotateradrg1io4c2 = rotaterg1io4cdefault;
        } else {
            rotateradrg1io4c2 = null;
            rotaterg1io4cdefault = rotateradrg1io4c;
        }
        RequestBuilder requestBuilder = this.MediaDescriptionCompat;
        if (requestBuilder != null) {
            if (!this.MediaBrowserCompatMediaItem) {
                Oklab oklab2 = requestBuilder.write ? oklab : requestBuilder.ParcelableVolumeInfo;
                if (insetdefault.RemoteActionCompatParcelizer(requestBuilder.MediaSessionCompatResultReceiverWrapper, 8)) {
                    renderIntentCompanion2 = this.MediaDescriptionCompat.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                } else {
                    int i7 = getAbsoluteuksYyKA.IconCompatParcelizer[renderIntentCompanion.ordinal()];
                    if (i7 == 1) {
                        renderIntentCompanion2 = RenderIntentCompanion.NORMAL;
                    } else if (i7 == 2) {
                        renderIntentCompanion2 = RenderIntentCompanion.HIGH;
                    } else {
                        if (i7 != 3 && i7 != 4) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, "unknown priority: ");
                            return null;
                        }
                        renderIntentCompanion2 = RenderIntentCompanion.IMMEDIATE;
                    }
                }
                RenderIntentCompanion renderIntentCompanion3 = renderIntentCompanion2;
                RequestBuilder requestBuilder2 = this.MediaDescriptionCompat;
                int i8 = requestBuilder2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                int i9 = requestBuilder2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                if (Fill.read(i, i2)) {
                    RequestBuilder requestBuilder3 = this.MediaDescriptionCompat;
                    if (Fill.read(requestBuilder3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, requestBuilder3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss)) {
                        i5 = i9;
                        i6 = i8;
                    } else {
                        i6 = insetdefaultVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        i5 = insetdefaultVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    }
                } else {
                    i5 = i9;
                    i6 = i8;
                }
                scaleFgt4K4Q scalefgt4k4q = new scaleFgt4K4Q(obj, rotaterg1io4cdefault);
                Context context = this.RemoteActionCompatParcelizer;
                accessgetPerceptualcp accessgetperceptualcp = this.serializer;
                SingleRequest singleRequest2 = new SingleRequest(context, accessgetperceptualcp, obj, this.MediaSessionCompatQueueItem, this.PlaybackStateCompatCustomAction, insetdefaultVar, i, i2, renderIntentCompanion, rotateradrg1io4cdefault, this.MediaMetadataCompat, scalefgt4k4q, accessgetperceptualcp.RatingCompat, oklab.IconCompatParcelizer);
                this.MediaBrowserCompatMediaItem = true;
                RequestBuilder requestBuilder4 = this.MediaDescriptionCompat;
                rotateRg1IO4c rotaterg1io4cIconCompatParcelizer = requestBuilder4.IconCompatParcelizer(obj, rotateradrg1io4cdefault, scalefgt4k4q, oklab2, renderIntentCompanion3, i6, i5, requestBuilder4);
                this.MediaBrowserCompatMediaItem = false;
                scalefgt4k4q.read = singleRequest2;
                scalefgt4k4q.MediaSessionCompatQueueItem = rotaterg1io4cIconCompatParcelizer;
                singleRequest = scalefgt4k4q;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
        } else {
            Context context2 = this.RemoteActionCompatParcelizer;
            accessgetPerceptualcp accessgetperceptualcp2 = this.serializer;
            singleRequest = new SingleRequest(context2, accessgetperceptualcp2, obj, this.MediaSessionCompatQueueItem, this.PlaybackStateCompatCustomAction, insetdefaultVar, i, i2, renderIntentCompanion, rotateradrg1io4cdefault, this.MediaMetadataCompat, rotaterg1io4cdefault, accessgetperceptualcp2.RatingCompat, oklab.IconCompatParcelizer);
        }
        rotateRg1IO4cdefault rotaterg1io4cdefault2 = rotateradrg1io4c2;
        if (rotaterg1io4cdefault2 == 0) {
            return singleRequest;
        }
        RequestBuilder requestBuilder5 = this.read;
        int i10 = requestBuilder5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        int i11 = requestBuilder5.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (Fill.read(i, i2)) {
            RequestBuilder requestBuilder6 = this.read;
            if (Fill.read(requestBuilder6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, requestBuilder6.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss)) {
                i3 = i11;
                i4 = i10;
            } else {
                i4 = insetdefaultVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                i3 = insetdefaultVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            }
        } else {
            i3 = i11;
            i4 = i10;
        }
        RequestBuilder requestBuilder7 = this.read;
        rotateRg1IO4c rotaterg1io4cIconCompatParcelizer2 = requestBuilder7.IconCompatParcelizer(obj, rotateradrg1io4cdefault, rotaterg1io4cdefault2, requestBuilder7.ParcelableVolumeInfo, requestBuilder7.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, i4, i3, requestBuilder7);
        rotaterg1io4cdefault2.IconCompatParcelizer = singleRequest;
        rotaterg1io4cdefault2.RemoteActionCompatParcelizer = rotaterg1io4cIconCompatParcelizer2;
        return rotaterg1io4cdefault2;
    }
}
