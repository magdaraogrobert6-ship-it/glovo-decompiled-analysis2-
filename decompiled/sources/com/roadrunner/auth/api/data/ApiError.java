package com.roadrunner.auth.api.data;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.common.data.api.UniqueHttpException;
import o.getCieXyz;
import o.getFillableData;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ApiError extends Exception {
    private static int read = 0;
    private static int write = 1;
    public final Throwable RemoteActionCompatParcelizer;

    public static final class InvalidCode extends ApiError {
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;
        public final UniqueHttpException read;
        public final int write;

        public InvalidCode(UniqueHttpException uniqueHttpException, int i) {
            super(uniqueHttpException, "Invalid OTP code");
            this.read = uniqueHttpException;
            this.write = i;
        }

        @Override // com.roadrunner.auth.api.data.ApiError, java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 71;
            int i3 = i2 % Fields.SpotShadowColor;
            serializer = i3;
            int i4 = i2 % 2;
            UniqueHttpException uniqueHttpException = this.read;
            int i5 = i3 + 27;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return uniqueHttpException;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = serializer + 75;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.write) + (this.read.hashCode() * 31);
            int i4 = IconCompatParcelizer + 35;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 97;
            int i3 = i2 % Fields.SpotShadowColor;
            serializer = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof InvalidCode) {
                InvalidCode invalidCode = (InvalidCode) obj;
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, invalidCode.read}, getCieXyz.write())).booleanValue() && this.write == invalidCode.write;
            }
            int i5 = i3 + 111;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            String str = "InvalidCode(cause=" + this.read + ", statusCode=" + this.write + ")";
            int i2 = IconCompatParcelizer + 53;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return str;
        }
    }

    public static final class InvalidFlow extends ApiError {
        private static int IconCompatParcelizer = 0;
        private static int read = 1;
        public final int serializer;
        public final UniqueHttpException write;

        public InvalidFlow(UniqueHttpException uniqueHttpException, int i) {
            super(uniqueHttpException, "Invalid flow ID");
            this.write = uniqueHttpException;
            this.serializer = i;
        }

        @Override // com.roadrunner.auth.api.data.ApiError, java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 15;
            int i3 = i2 % Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            UniqueHttpException uniqueHttpException = this.write;
            int i5 = i3 + 57;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 93 / 0;
            }
            return uniqueHttpException;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 5;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.serializer) + (this.write.hashCode() * 31);
            int i4 = read + 85;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 + 31;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof InvalidFlow) {
                InvalidFlow invalidFlow = (InvalidFlow) obj;
                Object[] objArr = {this.write, invalidFlow.write};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.serializer == invalidFlow.serializer) {
                    return true;
                }
            } else {
                int i5 = i2 + 111;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            int i7 = IconCompatParcelizer + 65;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            String str = "InvalidFlow(cause=" + this.write + ", statusCode=" + this.serializer + ")";
            int i2 = read + 77;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    public static final class TooManyAttempts extends ApiError {
        private static int serializer = 1;
        private static int write;

        @Override // com.roadrunner.auth.api.data.ApiError, java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 59;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 83;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 30 / 0;
            }
            return null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = serializer + 31;
            int i3 = i2 % Fields.SpotShadowColor;
            write = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 99;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 13;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 65 / 0;
            }
            int i5 = i2 + 87;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 5 / 0;
            }
            return "TooManyAttempts(cause=null)";
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = serializer;
            int i3 = i2 + 51;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (this == obj || (obj instanceof TooManyAttempts)) {
                int i5 = i2 + 51;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return true;
            }
            int i7 = i2 + 57;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }

        public TooManyAttempts(UniqueHttpException uniqueHttpException, String str) {
            super(uniqueHttpException, str);
        }
    }

    public static final class TwoFaFailureResponse extends ApiError {
        private static int MediaMetadataCompat = 1;
        private static int read;
        public final int IconCompatParcelizer;
        public final getFillableData serializer;
        public final UniqueHttpException write;

        public TwoFaFailureResponse(getFillableData getfillabledata, UniqueHttpException uniqueHttpException, int i) {
            super(uniqueHttpException, "Two fa verify error");
            this.serializer = getfillabledata;
            this.write = uniqueHttpException;
            this.IconCompatParcelizer = i;
        }

        @Override // com.roadrunner.auth.api.data.ApiError, java.lang.Throwable
        public final Throwable getCause() {
            int i = 2 % 2;
            int i2 = MediaMetadataCompat + 31;
            int i3 = i2 % Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            UniqueHttpException uniqueHttpException = this.write;
            int i5 = i3 + 89;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return uniqueHttpException;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = read + 121;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.serializer.hashCode();
            int iHashCode2 = Integer.hashCode(this.IconCompatParcelizer) + ((this.write.hashCode() + (iHashCode * 31)) * 31);
            int i4 = read + 43;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode2;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder("TwoFaFailureResponse(twoFaErrorResponse=");
            sb.append(this.serializer);
            sb.append(", cause=");
            sb.append(this.write);
            sb.append(", statusCode=");
            String strM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", sb);
            int i2 = read + 85;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
            }
            return strM;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if ((r21 instanceof com.roadrunner.auth.api.data.ApiError.TwoFaFailureResponse) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        
            r1 = (com.roadrunner.auth.api.data.ApiError.TwoFaFailureResponse) r21;
            r11 = new java.lang.Object[]{r20.serializer, r1.serializer};
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
        
            if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r11, o.getCieXyz.write())).booleanValue() != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        
            r18 = new java.lang.Object[]{r20.write, r1.write};
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
        
            if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        
            if (r20.IconCompatParcelizer == r1.IconCompatParcelizer) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        
            if (r20 == r21) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        
            if (r20 == r21) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        
            r4 = r4 + 105;
            com.roadrunner.auth.api.data.ApiError.TwoFaFailureResponse.MediaMetadataCompat = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r4 = r4 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = 2
                int r3 = r2 % r2
                int r3 = com.roadrunner.auth.api.data.ApiError.TwoFaFailureResponse.MediaMetadataCompat
                int r3 = r3 + 71
                int r4 = r3 % 128
                com.roadrunner.auth.api.data.ApiError.TwoFaFailureResponse.read = r4
                int r3 = r3 % r2
                r5 = 0
                if (r3 == 0) goto L19
                r3 = 63
                int r3 = r3 / r5
                if (r0 != r1) goto L23
                goto L1b
            L19:
                if (r0 != r1) goto L23
            L1b:
                int r4 = r4 + 105
                int r1 = r4 % 128
                com.roadrunner.auth.api.data.ApiError.TwoFaFailureResponse.MediaMetadataCompat = r1
                int r4 = r4 % r2
                goto L83
            L23:
                boolean r2 = r1 instanceof com.roadrunner.auth.api.data.ApiError.TwoFaFailureResponse
                if (r2 != 0) goto L28
                goto L82
            L28:
                com.roadrunner.auth.api.data.ApiError$TwoFaFailureResponse r1 = (com.roadrunner.auth.api.data.ApiError.TwoFaFailureResponse) r1
                o.getFillableData r2 = r0.serializer
                o.getFillableData r3 = r1.serializer
                java.lang.Object[] r11 = new java.lang.Object[]{r2, r3}
                int r6 = o.getCieXyz.write()
                int r10 = o.getCieXyz.write()
                int r12 = o.getCieXyz.write()
                int r9 = o.getCieXyz.write()
                r14 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
                r15 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
                r7 = r14
                r8 = r15
                java.lang.Object r2 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r6, r7, r8, r9, r10, r11, r12)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L57
                goto L82
            L57:
                com.roadrunner.common.data.api.UniqueHttpException r2 = r0.write
                com.roadrunner.common.data.api.UniqueHttpException r3 = r1.write
                java.lang.Object[] r18 = new java.lang.Object[]{r2, r3}
                int r13 = o.getCieXyz.write()
                int r17 = o.getCieXyz.write()
                int r19 = o.getCieXyz.write()
                int r16 = o.getCieXyz.write()
                java.lang.Object r2 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L7c
                goto L82
            L7c:
                int r2 = r0.IconCompatParcelizer
                int r1 = r1.IconCompatParcelizer
                if (r2 == r1) goto L83
            L82:
                return r5
            L83:
                r1 = 1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.api.data.ApiError.TwoFaFailureResponse.equals(java.lang.Object):boolean");
        }
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        int i = 2 % 2;
        int i2 = write + 33;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        Throwable th = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 35;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return th;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ApiError(UniqueHttpException uniqueHttpException, String str) {
        super(str, uniqueHttpException);
        this.RemoteActionCompatParcelizer = uniqueHttpException;
    }
}
