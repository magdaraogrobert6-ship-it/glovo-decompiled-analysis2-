package com.sentiance.core.model.tile.venue;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.MapFieldLite;
import com.sentiance.protobuf.a;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.DelayedInitializationAnalyticsBehavior;
import o.DrawableTransformation;
import o.InAppMessageEvent;
import o.accessgetDiskLruCachep;
import o.getAlignmentLinesMap;
import o.onSuccess;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.setDoesPushStoryDismissOnClickandroid_sdk_base_release;
import o.setFallbackFirebaseMessagingServiceClasspath;
import o.setFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release;
import o.setFirebaseCloudMessagingSenderIdKey;
import o.setFirebaseMessagingServiceOnNewTokenRegistrationEnabledandroid_sdk_base_release;
import o.setGeofencesEnabled;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class GeomV3 extends GeneratedMessageLite implements accessgetDiskLruCachep {
    public static final int CENTER_FIELD_NUMBER = 2;
    private static final GeomV3 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int POLYGON_FIELD_NUMBER = 4;
    public static final int TAGS_FIELD_NUMBER = 3;
    private Coord center_;
    private long id_;
    private Polygon polygon_;
    private MapFieldLite<String, String> tags_ = MapFieldLite.serializer;

    public static final class Coord extends GeneratedMessageLite implements setGeofencesEnabled {
        private static final Coord DEFAULT_INSTANCE;
        public static final int LAT_FIELD_NUMBER = 1;
        public static final int LON_FIELD_NUMBER = 2;
        private static volatile writeStringlambda1 PARSER;
        private int lat_;
        private int lon_;

        private Coord() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLat() {
            this.lat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLon() {
            this.lon_ = 0;
        }

        public static Coord getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLat(int i) {
            this.lat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLon(int i) {
            this.lon_ = i;
        }

        public int getLat() {
            return this.lat_;
        }

        public int getLon() {
            return this.lon_;
        }

        static {
            Coord coord = new Coord();
            DEFAULT_INSTANCE = coord;
            GeneratedMessageLite.registerDefaultInstance(Coord.class, coord);
        }

        public static setFallbackFirebaseMessagingServiceClasspath newBuilder() {
            return (setFallbackFirebaseMessagingServiceClasspath) DEFAULT_INSTANCE.createBuilder();
        }

        public static Coord parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Coord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Coord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Coord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static writeStringlambda1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.sentiance.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
            switch (setFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer[methodToInvoke.ordinal()]) {
                case 1:
                    return new Coord();
                case 2:
                    return new setFallbackFirebaseMessagingServiceClasspath(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000f\u0002\u000f", new Object[]{"lat_", "lon_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    writeStringlambda1 writestringlambda1 = PARSER;
                    if (writestringlambda1 != null) {
                        return writestringlambda1;
                    }
                    synchronized (Coord.class) {
                        r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = PARSER;
                        if (r8lambdaxuhu5lvqisjsccdg7c1_hbvwri == null) {
                            r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = new r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI();
                            PARSER = r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
                        }
                        break;
                    }
                    return r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    getAlignmentLinesMap.write();
                    return null;
            }
        }

        public static setFallbackFirebaseMessagingServiceClasspath newBuilder(Coord coord) {
            return (setFallbackFirebaseMessagingServiceClasspath) DEFAULT_INSTANCE.createBuilder(coord);
        }

        public static Coord parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
            return (Coord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
        }

        public static Coord parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            return (Coord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
        }

        public static Coord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Coord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Coord parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            return (Coord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
        }

        public static Coord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Coord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Coord parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            return (Coord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
        }

        public static Coord parseFrom(InputStream inputStream) throws IOException {
            return (Coord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Coord parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
            return (Coord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
        }

        public static Coord parseFrom(u uVar) throws IOException {
            return (Coord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
        }

        public static Coord parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
            return (Coord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
        }
    }

    public static final class Polygon extends GeneratedMessageLite implements accessgetDiskLruCachep {
        private static final Polygon DEFAULT_INSTANCE;
        private static volatile writeStringlambda1 PARSER = null;
        public static final int VERTICES_FIELD_NUMBER = 1;
        private onSuccess vertices_ = GeneratedMessageLite.emptyProtobufList();

        public static Polygon getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public List<Coord> getVerticesList() {
            return this.vertices_;
        }

        public List<? extends setGeofencesEnabled> getVerticesOrBuilderList() {
            return this.vertices_;
        }

        static {
            Polygon polygon = new Polygon();
            DEFAULT_INSTANCE = polygon;
            GeneratedMessageLite.registerDefaultInstance(Polygon.class, polygon);
        }

        public static setDoesPushStoryDismissOnClickandroid_sdk_base_release newBuilder() {
            return (setDoesPushStoryDismissOnClickandroid_sdk_base_release) DEFAULT_INSTANCE.createBuilder();
        }

        public static Polygon parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Polygon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Polygon parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static writeStringlambda1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.sentiance.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
            switch (setFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer[methodToInvoke.ordinal()]) {
                case 1:
                    return new Polygon();
                case 2:
                    return new setDoesPushStoryDismissOnClickandroid_sdk_base_release(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"vertices_", Coord.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    writeStringlambda1 writestringlambda1 = PARSER;
                    if (writestringlambda1 != null) {
                        return writestringlambda1;
                    }
                    synchronized (Polygon.class) {
                        r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = PARSER;
                        if (r8lambdaxuhu5lvqisjsccdg7c1_hbvwri == null) {
                            r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = new r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI();
                            PARSER = r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
                        }
                        break;
                    }
                    return r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    getAlignmentLinesMap.write();
                    return null;
            }
        }

        public Coord getVertices(int i) {
            return (Coord) this.vertices_.get(i);
        }

        public int getVerticesCount() {
            return this.vertices_.size();
        }

        public setGeofencesEnabled getVerticesOrBuilder(int i) {
            return (setGeofencesEnabled) this.vertices_.get(i);
        }

        private Polygon() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVertices(Iterable<? extends Coord> iterable) {
            ensureVerticesIsMutable();
            a.addAll((Iterable) iterable, (List) this.vertices_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVertices(Coord coord) {
            coord.getClass();
            ensureVerticesIsMutable();
            this.vertices_.add(coord);
        }

        private void ensureVerticesIsMutable() {
            onSuccess onsuccess = this.vertices_;
            if (((InAppMessageEvent) onsuccess).read) {
                return;
            }
            this.vertices_ = GeneratedMessageLite.mutableCopy(onsuccess);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeVertices(int i) {
            ensureVerticesIsMutable();
            this.vertices_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVertices(int i, Coord coord) {
            coord.getClass();
            ensureVerticesIsMutable();
            this.vertices_.set(i, coord);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVertices() {
            this.vertices_ = GeneratedMessageLite.emptyProtobufList();
        }

        public static setDoesPushStoryDismissOnClickandroid_sdk_base_release newBuilder(Polygon polygon) {
            return (setDoesPushStoryDismissOnClickandroid_sdk_base_release) DEFAULT_INSTANCE.createBuilder(polygon);
        }

        public static Polygon parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
            return (Polygon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
        }

        public static Polygon parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
        }

        public static Polygon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Polygon parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVertices(int i, Coord coord) {
            coord.getClass();
            ensureVerticesIsMutable();
            this.vertices_.add(i, coord);
        }

        public static Polygon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Polygon parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
        }

        public static Polygon parseFrom(InputStream inputStream) throws IOException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Polygon parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
        }

        public static Polygon parseFrom(u uVar) throws IOException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
        }

        public static Polygon parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
            return (Polygon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCenter() {
        this.center_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygon() {
        this.polygon_ = null;
    }

    public static GeomV3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableTagsMap() {
        return internalGetMutableTags();
    }

    private MapFieldLite<String, String> internalGetTags() {
        return this.tags_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    public long getId() {
        return this.id_;
    }

    @Deprecated
    public Map<String, String> getTags() {
        return getTagsMap();
    }

    public boolean hasCenter() {
        return this.center_ != null;
    }

    public boolean hasPolygon() {
        return this.polygon_ != null;
    }

    static {
        GeomV3 geomV3 = new GeomV3();
        DEFAULT_INSTANCE = geomV3;
        GeneratedMessageLite.registerDefaultInstance(GeomV3.class, geomV3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    private MapFieldLite<String, String> internalGetMutableTags() {
        if (!this.tags_.write()) {
            this.tags_ = this.tags_.IconCompatParcelizer();
        }
        return this.tags_;
    }

    public static setFirebaseCloudMessagingSenderIdKey newBuilder() {
        return (setFirebaseCloudMessagingSenderIdKey) DEFAULT_INSTANCE.createBuilder();
    }

    public static GeomV3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GeomV3) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GeomV3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GeomV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (setFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer[methodToInvoke.ordinal()]) {
            case 1:
                return new GeomV3();
            case 2:
                return new setFirebaseCloudMessagingSenderIdKey(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0003\u0002\t\u00032\u0004\t", new Object[]{"id_", "center_", "tags_", setFirebaseMessagingServiceOnNewTokenRegistrationEnabledandroid_sdk_base_release.write, "polygon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (GeomV3.class) {
                    r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = PARSER;
                    if (r8lambdaxuhu5lvqisjsccdg7c1_hbvwri == null) {
                        r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = new r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI();
                        PARSER = r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
                    }
                    break;
                }
                return r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    private GeomV3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCenter(Coord coord) {
        coord.getClass();
        Coord coord2 = this.center_;
        if (coord2 == null || coord2 == Coord.getDefaultInstance()) {
            this.center_ = coord;
            return;
        }
        setFallbackFirebaseMessagingServiceClasspath setfallbackfirebasemessagingserviceclasspathNewBuilder = Coord.newBuilder(this.center_);
        setfallbackfirebasemessagingserviceclasspathNewBuilder.serializer(coord);
        this.center_ = (Coord) setfallbackfirebasemessagingserviceclasspathNewBuilder.IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolygon(Polygon polygon) {
        polygon.getClass();
        Polygon polygon2 = this.polygon_;
        if (polygon2 == null || polygon2 == Polygon.getDefaultInstance()) {
            this.polygon_ = polygon;
            return;
        }
        setDoesPushStoryDismissOnClickandroid_sdk_base_release setdoespushstorydismissonclickandroid_sdk_base_releaseNewBuilder = Polygon.newBuilder(this.polygon_);
        setdoespushstorydismissonclickandroid_sdk_base_releaseNewBuilder.serializer(polygon);
        this.polygon_ = (Polygon) setdoespushstorydismissonclickandroid_sdk_base_releaseNewBuilder.IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCenter(Coord coord) {
        coord.getClass();
        this.center_ = coord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygon(Polygon polygon) {
        polygon.getClass();
        this.polygon_ = polygon;
    }

    public boolean containsTags(String str) {
        str.getClass();
        return internalGetTags().containsKey(str);
    }

    public String getTagsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetTags = internalGetTags();
        return mapFieldLiteInternalGetTags.containsKey(str) ? mapFieldLiteInternalGetTags.get(str) : str2;
    }

    public String getTagsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetTags = internalGetTags();
        if (mapFieldLiteInternalGetTags.containsKey(str)) {
            return mapFieldLiteInternalGetTags.get(str);
        }
        DrawableTransformation.write();
        return null;
    }

    public Coord getCenter() {
        Coord coord = this.center_;
        return coord == null ? Coord.getDefaultInstance() : coord;
    }

    public Polygon getPolygon() {
        Polygon polygon = this.polygon_;
        return polygon == null ? Polygon.getDefaultInstance() : polygon;
    }

    public int getTagsCount() {
        return internalGetTags().size();
    }

    public Map<String, String> getTagsMap() {
        return Collections.unmodifiableMap(internalGetTags());
    }

    public static setFirebaseCloudMessagingSenderIdKey newBuilder(GeomV3 geomV3) {
        return (setFirebaseCloudMessagingSenderIdKey) DEFAULT_INSTANCE.createBuilder(geomV3);
    }

    public static GeomV3 parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GeomV3) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static GeomV3 parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GeomV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static GeomV3 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GeomV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GeomV3 parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GeomV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static GeomV3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GeomV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GeomV3 parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GeomV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static GeomV3 parseFrom(InputStream inputStream) throws IOException {
        return (GeomV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GeomV3 parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GeomV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static GeomV3 parseFrom(u uVar) throws IOException {
        return (GeomV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static GeomV3 parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GeomV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
