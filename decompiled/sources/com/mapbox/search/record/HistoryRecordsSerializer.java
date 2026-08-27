package com.mapbox.search.record;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.mapbox.search.utils.serialization.RecordsSerializer;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryRecordsSerializer extends RecordsSerializer {
    public final /* synthetic */ int $r8$classId;

    public final class HistoryData implements RecordsSerializer.RecordsData {

        @SerializedName("version")
        private final int version = 0;

        @SerializedName("records")
        private final List<Object> records = instance_delegatelambda0.write;

        @Override // com.mapbox.search.utils.serialization.RecordsSerializer.RecordsData
        public final List getRecords() {
            return this.records;
        }

        @Override // com.mapbox.search.utils.serialization.RecordsSerializer.RecordsData
        public final int getVersion() {
            return this.version;
        }

        public final int hashCode() {
            return this.records.hashCode() + (Integer.hashCode(this.version) * 31);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HistoryData)) {
                return false;
            }
            HistoryData historyData = (HistoryData) obj;
            if (this.version != historyData.version) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.records, historyData.records}, getCieXyz.write())).booleanValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HistoryData(version=");
            sb.append(this.version);
            sb.append(", records=");
            return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.records, ')');
        }
    }

    @Override // com.mapbox.search.utils.serialization.RecordsSerializer
    public final RecordsSerializer.RecordsData restoreRecord(String str) {
        int i = this.$r8$classId;
        Object obj = this.gson;
        if (i != 0) {
            if (str.length() == 0) {
                return new RecordsSerializer.RecordsData() { // from class: com.mapbox.search.record.FavoriteRecordsSerializer$FavoritesData

                    @SerializedName("version")
                    private final int version = 0;

                    @SerializedName("records")
                    private final List<Object> records = instance_delegatelambda0.write;

                    @Override // com.mapbox.search.utils.serialization.RecordsSerializer.RecordsData
                    public final List getRecords() {
                        return this.records;
                    }

                    @Override // com.mapbox.search.utils.serialization.RecordsSerializer.RecordsData
                    public final int getVersion() {
                        return this.version;
                    }

                    public final int hashCode() {
                        return this.records.hashCode() + (Integer.hashCode(this.version) * 31);
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof FavoriteRecordsSerializer$FavoritesData)) {
                            return false;
                        }
                        FavoriteRecordsSerializer$FavoritesData favoriteRecordsSerializer$FavoritesData = (FavoriteRecordsSerializer$FavoritesData) obj2;
                        if (this.version != favoriteRecordsSerializer$FavoritesData.version) {
                            return false;
                        }
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.records, favoriteRecordsSerializer$FavoritesData.records}, getCieXyz.write())).booleanValue();
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("FavoritesData(version=");
                        sb.append(this.version);
                        sb.append(", records=");
                        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.records, ')');
                    }
                };
            }
            Object objFromJson = ((Gson) obj).fromJson(str, (Class<Object>) FavoriteRecordsSerializer$FavoritesData.class);
            objFromJson.getClass();
            return (FavoriteRecordsSerializer$FavoritesData) objFromJson;
        }
        if (str.length() == 0) {
            return new HistoryData();
        }
        Object objFromJson2 = ((Gson) obj).fromJson(str, (Class<Object>) HistoryData.class);
        objFromJson2.getClass();
        return (HistoryData) objFromJson2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HistoryRecordsSerializer(int i) {
        super(0);
        this.$r8$classId = i;
    }
}
