package o;

/* JADX INFO: loaded from: classes3.dex */
public class getLongitudeannotations<T> {
    private final T IconCompatParcelizer;
    private final Integer MediaSessionCompatQueueItem;
    private final Long RatingCompat;
    private final long RemoteActionCompatParcelizer;
    private final Object read;
    private final long serializer;
    private final long write;

    public final Long MediaDescriptionCompat() {
        return this.RatingCompat;
    }

    public final long MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Object RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final T read() {
        return this.IconCompatParcelizer;
    }

    public final long serializer() {
        return this.serializer;
    }

    public final long write() {
        return this.write;
    }

    public static class serializer<T> {
        private long IconCompatParcelizer;
        private Long MediaDescriptionCompat;
        private Integer MediaSessionCompatQueueItem;
        private long RemoteActionCompatParcelizer;
        private r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k read;
        private Object serializer;
        private long write;

        public final void RemoteActionCompatParcelizer(long j) {
            this.write = j;
        }

        public final void serializer(long j) {
            this.IconCompatParcelizer = j;
        }

        public final void serializer(r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k) {
            this.read = r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        }

        public final void IconCompatParcelizer(Object obj) {
            this.serializer = obj;
        }

        public final void write(Integer num) {
            this.MediaSessionCompatQueueItem = num;
        }

        public final void read(long j) {
            this.RemoteActionCompatParcelizer = j;
        }

        public final void RemoteActionCompatParcelizer(Long l) {
            this.MediaDescriptionCompat = l;
        }
    }

    public getLongitudeannotations(serializer<T> serializerVar) {
        this.IconCompatParcelizer = (T) ((serializer) serializerVar).read;
        this.read = ((serializer) serializerVar).serializer;
        this.write = ((serializer) serializerVar).IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = ((serializer) serializerVar).write;
        this.MediaSessionCompatQueueItem = ((serializer) serializerVar).MediaSessionCompatQueueItem;
        this.serializer = ((serializer) serializerVar).RemoteActionCompatParcelizer;
        this.RatingCompat = ((serializer) serializerVar).MediaDescriptionCompat;
    }

    public static <T> getLongitudeannotations<T> serializer(getVerticalAccuracy getverticalaccuracy, r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu, long j, Object obj) {
        getverticalaccuracy.getClass();
        r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite = getVerticalAccuracy.write(r8lambdaqtf70aj7a5o7b4yj33reyelsu);
        if (r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite == null) {
            return null;
        }
        serializer serializerVar = new serializer();
        serializerVar.serializer(r8lambdanclnumohj3w_eprkcj4qjg7b2kWrite);
        serializerVar.read(j);
        serializerVar.RemoteActionCompatParcelizer(r8lambdaqtf70aj7a5o7b4yj33reyelsu.MediaDescriptionCompat);
        serializerVar.RemoteActionCompatParcelizer(r8lambdaqtf70aj7a5o7b4yj33reyelsu.write.longValue());
        serializerVar.write(r8lambdaqtf70aj7a5o7b4yj33reyelsu.IconCompatParcelizer);
        serializerVar.serializer(r8lambdaqtf70aj7a5o7b4yj33reyelsu.RemoteActionCompatParcelizer.longValue());
        serializerVar.IconCompatParcelizer(obj);
        return new getLongitudeannotations<>(serializerVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInfo{mEvent=");
        sb.append(getTrackingStringandroid_sdk_base_releaseannotations.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", mEventTime=");
        sb.append(this.write);
        sb.append(", mIngestionTime=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.RemoteActionCompatParcelizer, '}');
    }

    public final Integer IconCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }
}
