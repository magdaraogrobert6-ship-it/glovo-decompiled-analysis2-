package com.data.error;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.common.data.api.UniqueHttpException;
import o.accessgetOutlinePathp;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ApiException extends Exception {
    public final UniqueHttpException IconCompatParcelizer;
    public final accessgetOutlinePathp RemoteActionCompatParcelizer;

    public static final class BadRequest extends ApiException {
        public final int read;
        public final accessgetOutlinePathp serializer;
        public final UniqueHttpException write;

        @Override // com.data.error.ApiException
        public final int RemoteActionCompatParcelizer() {
            return this.read;
        }

        @Override // com.data.error.ApiException, java.lang.Throwable
        public final Throwable getCause() {
            return this.write;
        }

        @Override // com.data.error.ApiException
        public final accessgetOutlinePathp read() {
            return this.serializer;
        }

        public final int hashCode() {
            return this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.read, this.serializer.hashCode() * 31, 31);
        }

        public BadRequest(accessgetOutlinePathp accessgetoutlinepathp, int i, UniqueHttpException uniqueHttpException) {
            super(accessgetoutlinepathp, uniqueHttpException);
            this.serializer = accessgetoutlinepathp;
            this.read = i;
            this.write = uniqueHttpException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BadRequest)) {
                return false;
            }
            BadRequest badRequest = (BadRequest) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, badRequest.serializer}, getCieXyz.write())).booleanValue() || this.read != badRequest.read) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, badRequest.write}, getCieXyz.write())).booleanValue();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "BadRequest(error=" + this.serializer + ", httpStatusCode=" + this.read + ", cause=" + this.write + ")";
        }
    }

    public static final class ForceAppUpdateRequired extends ApiException {
        public final accessgetOutlinePathp read;
        public final int serializer;
        public final UniqueHttpException write;

        @Override // com.data.error.ApiException
        public final int RemoteActionCompatParcelizer() {
            return this.serializer;
        }

        @Override // com.data.error.ApiException, java.lang.Throwable
        public final Throwable getCause() {
            return this.write;
        }

        @Override // com.data.error.ApiException
        public final accessgetOutlinePathp read() {
            return this.read;
        }

        public final int hashCode() {
            return this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.serializer, this.read.hashCode() * 31, 31);
        }

        public ForceAppUpdateRequired(accessgetOutlinePathp accessgetoutlinepathp, int i, UniqueHttpException uniqueHttpException) {
            super(accessgetoutlinepathp, uniqueHttpException);
            this.read = accessgetoutlinepathp;
            this.serializer = i;
            this.write = uniqueHttpException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForceAppUpdateRequired)) {
                return false;
            }
            ForceAppUpdateRequired forceAppUpdateRequired = (ForceAppUpdateRequired) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, forceAppUpdateRequired.read}, getCieXyz.write())).booleanValue() || this.serializer != forceAppUpdateRequired.serializer) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, forceAppUpdateRequired.write}, getCieXyz.write())).booleanValue();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "ForceAppUpdateRequired(error=" + this.read + ", httpStatusCode=" + this.serializer + ", cause=" + this.write + ")";
        }
    }

    public static final class General extends ApiException {
        public final int read;
        public final accessgetOutlinePathp serializer;
        public final UniqueHttpException write;

        @Override // com.data.error.ApiException
        public final int RemoteActionCompatParcelizer() {
            return this.read;
        }

        @Override // com.data.error.ApiException, java.lang.Throwable
        public final Throwable getCause() {
            return this.write;
        }

        @Override // com.data.error.ApiException
        public final accessgetOutlinePathp read() {
            return this.serializer;
        }

        public final int hashCode() {
            return this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.read, this.serializer.hashCode() * 31, 31);
        }

        public General(accessgetOutlinePathp accessgetoutlinepathp, int i, UniqueHttpException uniqueHttpException) {
            super(accessgetoutlinepathp, uniqueHttpException);
            this.serializer = accessgetoutlinepathp;
            this.read = i;
            this.write = uniqueHttpException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof General)) {
                return false;
            }
            General general = (General) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, general.serializer}, getCieXyz.write())).booleanValue() || this.read != general.read) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, general.write}, getCieXyz.write())).booleanValue();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "General(error=" + this.serializer + ", httpStatusCode=" + this.read + ", cause=" + this.write + ")";
        }
    }

    public abstract int RemoteActionCompatParcelizer();

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.IconCompatParcelizer;
    }

    public accessgetOutlinePathp read() {
        return this.RemoteActionCompatParcelizer;
    }

    public static abstract class SessionExpired extends ApiException {
        public final accessgetOutlinePathp read;
        public final UniqueHttpException serializer;
        public final int write;

        public static final class Forbidden extends SessionExpired {
            public final UniqueHttpException MediaBrowserCompatMediaItem;
            public final accessgetOutlinePathp MediaMetadataCompat;
            public final int RatingCompat;

            @Override // com.data.error.ApiException.SessionExpired, com.data.error.ApiException
            public final int RemoteActionCompatParcelizer() {
                return this.RatingCompat;
            }

            @Override // com.data.error.ApiException.SessionExpired, com.data.error.ApiException, java.lang.Throwable
            public final Throwable getCause() {
                return this.MediaBrowserCompatMediaItem;
            }

            @Override // com.data.error.ApiException.SessionExpired, com.data.error.ApiException
            public final accessgetOutlinePathp read() {
                return this.MediaMetadataCompat;
            }

            public final int hashCode() {
                return this.MediaBrowserCompatMediaItem.hashCode() + af$$ExternalSyntheticOutline0.m(this.RatingCompat, this.MediaMetadataCompat.hashCode() * 31, 31);
            }

            public Forbidden(accessgetOutlinePathp accessgetoutlinepathp, int i, UniqueHttpException uniqueHttpException) {
                super(accessgetoutlinepathp, i, uniqueHttpException);
                this.MediaMetadataCompat = accessgetoutlinepathp;
                this.RatingCompat = i;
                this.MediaBrowserCompatMediaItem = uniqueHttpException;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Forbidden)) {
                    return false;
                }
                Forbidden forbidden = (Forbidden) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, forbidden.MediaMetadataCompat}, getCieXyz.write())).booleanValue() || this.RatingCompat != forbidden.RatingCompat) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, forbidden.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue();
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "Forbidden(error=" + this.MediaMetadataCompat + ", httpStatusCode=" + this.RatingCompat + ", cause=" + this.MediaBrowserCompatMediaItem + ")";
            }
        }

        public static final class Unauthorized extends SessionExpired {
            public final UniqueHttpException MediaDescriptionCompat;
            public final int MediaMetadataCompat;
            public final accessgetOutlinePathp MediaSessionCompatQueueItem;

            @Override // com.data.error.ApiException.SessionExpired, com.data.error.ApiException
            public final int RemoteActionCompatParcelizer() {
                return this.MediaMetadataCompat;
            }

            @Override // com.data.error.ApiException.SessionExpired, com.data.error.ApiException, java.lang.Throwable
            public final Throwable getCause() {
                return this.MediaDescriptionCompat;
            }

            @Override // com.data.error.ApiException.SessionExpired, com.data.error.ApiException
            public final accessgetOutlinePathp read() {
                return this.MediaSessionCompatQueueItem;
            }

            public final int hashCode() {
                return this.MediaDescriptionCompat.hashCode() + af$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat, this.MediaSessionCompatQueueItem.hashCode() * 31, 31);
            }

            public Unauthorized(accessgetOutlinePathp accessgetoutlinepathp, int i, UniqueHttpException uniqueHttpException) {
                super(accessgetoutlinepathp, i, uniqueHttpException);
                this.MediaSessionCompatQueueItem = accessgetoutlinepathp;
                this.MediaMetadataCompat = i;
                this.MediaDescriptionCompat = uniqueHttpException;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Unauthorized)) {
                    return false;
                }
                Unauthorized unauthorized = (Unauthorized) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, unauthorized.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue() || this.MediaMetadataCompat != unauthorized.MediaMetadataCompat) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, unauthorized.MediaDescriptionCompat}, getCieXyz.write())).booleanValue();
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "Unauthorized(error=" + this.MediaSessionCompatQueueItem + ", httpStatusCode=" + this.MediaMetadataCompat + ", cause=" + this.MediaDescriptionCompat + ")";
            }
        }

        @Override // com.data.error.ApiException
        public int RemoteActionCompatParcelizer() {
            return this.write;
        }

        @Override // com.data.error.ApiException, java.lang.Throwable
        public Throwable getCause() {
            return this.serializer;
        }

        @Override // com.data.error.ApiException
        public accessgetOutlinePathp read() {
            return this.read;
        }

        public SessionExpired(accessgetOutlinePathp accessgetoutlinepathp, int i, UniqueHttpException uniqueHttpException) {
            super(accessgetoutlinepathp, uniqueHttpException);
            this.read = accessgetoutlinepathp;
            this.write = i;
            this.serializer = uniqueHttpException;
        }
    }

    public ApiException(accessgetOutlinePathp accessgetoutlinepathp, UniqueHttpException uniqueHttpException) {
        super(accessgetoutlinepathp.message, uniqueHttpException);
        this.IconCompatParcelizer = uniqueHttpException;
        this.RemoteActionCompatParcelizer = accessgetoutlinepathp;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = read().message;
        if (str != null) {
            return str;
        }
        String message = getCause().getMessage();
        return message == null ? "" : message;
    }
}
