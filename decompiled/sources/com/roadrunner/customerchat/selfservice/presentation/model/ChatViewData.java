package com.roadrunner.customerchat.selfservice.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import o.getBitmapFromCache;
import o.getCieXyz;
import o.getHyphensEaSxInsannotations;
import o.getLineBreakLgCVezoannotations;
import o.getTextDirectionmmuk1toannotations;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatViewData implements Parcelable {
    public static final Parcelable.Creator<ChatViewData> CREATOR = new getTextDirectionmmuk1toannotations();
    private static int IconCompatParcelizer = 1;
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    private static int serializer;
    public final Delivery RemoteActionCompatParcelizer;
    public final String read;
    public final Registration write;

    public static final class Delivery implements Parcelable {
        public static final Parcelable.Creator<Delivery> CREATOR = new getHyphensEaSxInsannotations();
        private static int MediaSessionCompatResultReceiverWrapper = 0;
        private static int ParcelableVolumeInfo = 1;
        private static int PlaybackStateCompat = 1;
        private static int PlaybackStateCompatCustomAction;
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompatMediaItem;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final long MediaSessionCompatQueueItem;
        public final String RatingCompat;
        public final String RemoteActionCompatParcelizer;
        public final String read;
        public final String serializer;
        public final String write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = PlaybackStateCompatCustomAction + 55;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return 0;
        }

        static {
            int i = PlaybackStateCompat + 115;
            MediaSessionCompatResultReceiverWrapper = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public final String RemoteActionCompatParcelizer() {
            int i = 2 % 2;
            int i2 = PlaybackStateCompatCustomAction + 101;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return this.serializer;
            }
            throw null;
        }

        public Delivery(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            af$$ExternalSyntheticOutline0.m3978m(str, str2, str5);
            this.MediaSessionCompatQueueItem = j;
            this.MediaDescriptionCompat = str;
            this.serializer = str2;
            this.RatingCompat = str3;
            this.MediaBrowserCompatMediaItem = str4;
            this.IconCompatParcelizer = str5;
            this.write = str6;
            this.RemoteActionCompatParcelizer = str7;
            this.read = str8;
            this.MediaMetadataCompat = str9;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = PlaybackStateCompatCustomAction + 61;
            ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeLong(this.MediaSessionCompatQueueItem);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.serializer);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.MediaBrowserCompatMediaItem);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.write);
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaMetadataCompat);
            int i5 = PlaybackStateCompatCustomAction + 45;
            ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = PlaybackStateCompatCustomAction + 37;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            StringBuilder sb = getBitmapFromCache.read("Delivery(id=", ", statusValue=", this.MediaSessionCompatQueueItem, this.MediaDescriptionCompat);
            c8$$ExternalSyntheticOutline0.m(sb, ", confirmationNumber=", this.serializer, ", vendorOrderNumber=", this.RatingCompat);
            c8$$ExternalSyntheticOutline0.m(sb, ", paymentAmount=", this.MediaBrowserCompatMediaItem, ", channelId=", this.IconCompatParcelizer);
            c8$$ExternalSyntheticOutline0.m(sb, ", customerAddress=", this.write, ", customerName=", this.RemoteActionCompatParcelizer);
            String strM = d$$ExternalSyntheticOutline0.m(sb, ", customerPhoneNumber=REDACTED, instructions=", this.MediaMetadataCompat, ")");
            int i4 = ParcelableVolumeInfo + 25;
            PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return strM;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i = 2 % 2;
            int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.MediaSessionCompatQueueItem) * 31, 31, this.MediaDescriptionCompat), 31, this.serializer);
            String str = this.RatingCompat;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.MediaBrowserCompatMediaItem;
            if (str2 == null) {
                int i2 = PlaybackStateCompatCustomAction + 7;
                ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str2.hashCode();
            }
            int iM2 = af$$ExternalSyntheticOutline0.m((((iM + iHashCode4) * 31) + iHashCode) * 31, 31, this.IconCompatParcelizer);
            String str3 = this.write;
            if (str3 == null) {
                int i4 = PlaybackStateCompatCustomAction + 65;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str3.hashCode();
            }
            String str4 = this.RemoteActionCompatParcelizer;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.read;
            if (str5 == null) {
                int i6 = ParcelableVolumeInfo + 71;
                PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str5.hashCode();
            }
            String str6 = this.MediaMetadataCompat;
            return ((((((iM2 + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (!(obj instanceof Delivery)) {
                    return false;
                }
                Delivery delivery = (Delivery) obj;
                if (this.MediaSessionCompatQueueItem != delivery.MediaSessionCompatQueueItem) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, delivery.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, delivery.serializer}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, delivery.RatingCompat}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, delivery.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, delivery.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, delivery.write}, getCieXyz.write())).booleanValue()) {
                            int i2 = PlaybackStateCompatCustomAction + 3;
                            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
                            int i3 = i2 % 2;
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, delivery.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, delivery.read}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, delivery.MediaMetadataCompat}, getCieXyz.write())).booleanValue();
                    }
                    int i4 = PlaybackStateCompatCustomAction + 57;
                    int i5 = i4 % Fields.SpotShadowColor;
                    ParcelableVolumeInfo = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 39;
                    PlaybackStateCompatCustomAction = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return false;
                }
                int i9 = ParcelableVolumeInfo + 63;
                PlaybackStateCompatCustomAction = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return false;
            }
            int i11 = ParcelableVolumeInfo + 105;
            PlaybackStateCompatCustomAction = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return true;
        }
    }

    public static final class Registration implements Parcelable {
        public static final Parcelable.Creator<Registration> CREATOR = new getLineBreakLgCVezoannotations();
        private static int IconCompatParcelizer = 0;
        private static int MediaBrowserCompatMediaItem = 1;
        private static int serializer = 1;
        private static int write;
        public final String RemoteActionCompatParcelizer;
        public final String read;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 85;
            int i3 = i2 % Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i3;
            int i4 = i2 % 2 == 0 ? 1 : 0;
            int i5 = i3 + 123;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return i4;
            }
            throw null;
        }

        static {
            int i = write + 27;
            serializer = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 7;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 1;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return "Registration(userId=REDACTED, userEmail=REDACTED)";
        }

        public Registration(String str, String str2) {
            str.getClass();
            this.RemoteActionCompatParcelizer = str;
            this.read = str2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = MediaBrowserCompatMediaItem + 55;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                parcel.getClass();
                parcel.writeString(this.RemoteActionCompatParcelizer);
                parcel.writeString(this.read);
                throw null;
            }
            parcel.getClass();
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeString(this.read);
            int i4 = MediaBrowserCompatMediaItem + 121;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 34 / 0;
            }
        }

        public final int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            String str = this.read;
            if (str == null) {
                int i3 = IconCompatParcelizer + 37;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode2 = str.hashCode();
                int i5 = MediaBrowserCompatMediaItem + 93;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i = iHashCode2;
            }
            return (iHashCode * 31) + i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            r1 = 37 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if ((r22 instanceof com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        
            r1 = (com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration) r22;
            r12 = new java.lang.Object[]{r21.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        
            r19 = new java.lang.Object[]{r21.read, r1.read};
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        
            if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
        
            r1 = com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration.MediaBrowserCompatMediaItem + 65;
            com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r21 == r22) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if (r21 == r22) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        
            r3 = r3 + 13;
            com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration.MediaBrowserCompatMediaItem = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            if ((r3 % 2) != 0) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r2 = 2
                int r3 = r2 % r2
                int r3 = com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration.IconCompatParcelizer
                int r4 = r3 + 41
                int r5 = r4 % 128
                com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration.MediaBrowserCompatMediaItem = r5
                int r4 = r4 % r2
                r5 = 1
                r6 = 0
                if (r4 != 0) goto L1a
                r4 = 66
                int r4 = r4 / r6
                if (r0 != r1) goto L29
                goto L1c
            L1a:
                if (r0 != r1) goto L29
            L1c:
                int r3 = r3 + 13
                int r1 = r3 % 128
                com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration.MediaBrowserCompatMediaItem = r1
                int r3 = r3 % r2
                if (r3 != 0) goto L28
                r1 = 37
                int r1 = r1 / r6
            L28:
                return r5
            L29:
                boolean r3 = r1 instanceof com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration
                if (r3 != 0) goto L2e
                return r6
            L2e:
                com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData$Registration r1 = (com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration) r1
                java.lang.String r3 = r0.RemoteActionCompatParcelizer
                java.lang.String r4 = r1.RemoteActionCompatParcelizer
                java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
                int r7 = o.getCieXyz.write()
                int r11 = o.getCieXyz.write()
                int r13 = o.getCieXyz.write()
                int r10 = o.getCieXyz.write()
                r15 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
                r16 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
                r8 = r15
                r9 = r16
                java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L5e
                return r6
            L5e:
                java.lang.String r3 = r0.read
                java.lang.String r1 = r1.read
                java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
                int r14 = o.getCieXyz.write()
                int r18 = o.getCieXyz.write()
                int r20 = o.getCieXyz.write()
                int r17 = o.getCieXyz.write()
                java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L8c
                int r1 = com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration.MediaBrowserCompatMediaItem
                int r1 = r1 + 65
                int r3 = r1 % 128
                com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration.IconCompatParcelizer = r3
                int r1 = r1 % r2
                return r6
            L8c:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData.Registration.equals(java.lang.Object):boolean");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 81;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        return i2 % 2 == 0 ? 1 : 0;
    }

    static {
        int i = IconCompatParcelizer + 113;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Delivery RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 75;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Delivery delivery = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 29;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return delivery;
    }

    public ChatViewData(String str, Delivery delivery, Registration registration) {
        str.getClass();
        delivery.getClass();
        registration.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = delivery;
        this.write = registration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 49;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeString(this.read);
        this.RemoteActionCompatParcelizer.writeToParcel(parcel, i);
        this.write.writeToParcel(parcel, i);
        int i5 = MediaMetadataCompat + 31;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 99;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int iHashCode2 = this.read.hashCode();
            iHashCode = this.write.hashCode() * ((this.RemoteActionCompatParcelizer.hashCode() >>> (iHashCode2 + 89)) / 95);
        } else {
            int iHashCode3 = this.read.hashCode();
            iHashCode = this.write.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + (iHashCode3 * 31)) * 31);
        }
        int i3 = MediaSessionCompatQueueItem + 81;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 82 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ChatViewData(globalEntityId=" + this.read + ", delivery=" + this.RemoteActionCompatParcelizer + ", registration=" + this.write + ")";
        int i2 = MediaMetadataCompat + 53;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatViewData)) {
            return false;
        }
        ChatViewData chatViewData = (ChatViewData) obj;
        Object[] objArr = {this.read, chatViewData.read};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.RemoteActionCompatParcelizer, chatViewData.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                int i2 = MediaMetadataCompat + 11;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            Object[] objArr3 = {this.write, chatViewData.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = MediaMetadataCompat + 69;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return false;
        }
        int i6 = MediaSessionCompatQueueItem + 95;
        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
