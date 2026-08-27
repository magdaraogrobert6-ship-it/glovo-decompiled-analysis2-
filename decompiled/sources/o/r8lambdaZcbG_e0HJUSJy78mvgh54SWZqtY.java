package o;

import java.util.regex.Pattern;
import o.migrateTriggersReeligibilityToJsonlambda4;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY {
    private final r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M IconCompatParcelizer;
    private final migrateTriggersReeligibilityToJsonlambda4<r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA> write;

    public final r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M MediaDescriptionCompat() {
        return this.IconCompatParcelizer;
    }

    public final migrateTriggersReeligibilityToJsonlambda4<r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA> RatingCompat() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer.read();
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer.serializer();
    }

    public final boolean MediaMetadataCompat() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    public final String MediaSessionCompatQueueItem() {
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa = this.write.read();
        if (r8lambdazgdcm_k4mtbwe6bmdwjk2beesa != null) {
            return r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.read();
        }
        return null;
    }

    public final String RemoteActionCompatParcelizer() {
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa = this.write.read();
        if (r8lambdazgdcm_k4mtbwe6bmdwjk2beesa != null) {
            return r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.RemoteActionCompatParcelizer();
        }
        return null;
    }

    public final int hashCode() {
        r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m = this.IconCompatParcelizer;
        int iHashCode = Boolean.hashCode(r8lambdar7ywl9ynsudagvjliqatfcbze4m.serializer());
        int iHashCode2 = Boolean.hashCode(r8lambdar7ywl9ynsudagvjliqatfcbze4m.IconCompatParcelizer());
        int iHashCode3 = r8lambdar7ywl9ynsudagvjliqatfcbze4m.RemoteActionCompatParcelizer().hashCode();
        String str = r8lambdar7ywl9ynsudagvjliqatfcbze4m.read();
        int iHashCode4 = str != null ? str.hashCode() : 0;
        String strMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        int iHashCode5 = strMediaSessionCompatQueueItem != null ? strMediaSessionCompatQueueItem.hashCode() : 0;
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int iHashCode6 = strRemoteActionCompatParcelizer != null ? strRemoteActionCompatParcelizer.hashCode() : 0;
        migrateTriggersReeligibilityToJsonlambda4<r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA> migratetriggersreeligibilitytojsonlambda4 = this.write;
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa = migratetriggersreeligibilitytojsonlambda4.read();
        String strSerializer = r8lambdazgdcm_k4mtbwe6bmdwjk2beesa != null ? r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.serializer() : null;
        int iHashCode7 = strSerializer != null ? strSerializer.hashCode() : 0;
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa2 = migratetriggersreeligibilitytojsonlambda4.read();
        String strIconCompatParcelizer = r8lambdazgdcm_k4mtbwe6bmdwjk2beesa2 != null ? r8lambdazgdcm_k4mtbwe6bmdwjk2beesa2.IconCompatParcelizer() : null;
        return ((((((((((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (strIconCompatParcelizer != null ? strIconCompatParcelizer.hashCode() : 0);
    }

    public final String serializer() {
        r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m = this.IconCompatParcelizer;
        String strRemoteActionCompatParcelizer = r8lambdar7ywl9ynsudagvjliqatfcbze4m.RemoteActionCompatParcelizer();
        Pattern patternCompile = Pattern.compile(".*/");
        patternCompile.getClass();
        strRemoteActionCompatParcelizer.getClass();
        String strReplaceAll = patternCompile.matcher(strRemoteActionCompatParcelizer).replaceAll("");
        strReplaceAll.getClass();
        String str = r8lambdar7ywl9ynsudagvjliqatfcbze4m.read();
        return str == null ? strReplaceAll : str;
    }

    public final String write() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY(r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m, final r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa) {
        this(r8lambdar7ywl9ynsudagvjliqatfcbze4m, new migrateTriggersStorageToJsonlambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.authentication.AuthInfo$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((migrateTriggersReeligibilityToJsonlambda4) obj).getClass();
                return r8lambdazgdcm_k4mtbwe6bmdwjk2beesa;
            }

            {
                super(1);
            }
        }));
        r8lambdar7ywl9ynsudagvjliqatfcbze4m.getClass();
        r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.getClass();
    }

    public final r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY read(String str) {
        str.getClass();
        r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m = this.IconCompatParcelizer;
        return new r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY(new r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M(r8lambdar7ywl9ynsudagvjliqatfcbze4m.RemoteActionCompatParcelizer(), str, r8lambdar7ywl9ynsudagvjliqatfcbze4m.serializer(), r8lambdar7ywl9ynsudagvjliqatfcbze4m.IconCompatParcelizer()), this.write);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty = (r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY) obj;
        migrateTriggersReeligibilityToJsonlambda4<r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA> migratetriggersreeligibilitytojsonlambda4 = r8lambdazcbg_e0hjusjy78mvgh54swzqty.write;
        r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m = r8lambdazcbg_e0hjusjy78mvgh54swzqty.IconCompatParcelizer;
        r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m2 = this.IconCompatParcelizer;
        if (r8lambdar7ywl9ynsudagvjliqatfcbze4m2.serializer() != r8lambdar7ywl9ynsudagvjliqatfcbze4m.serializer() || r8lambdar7ywl9ynsudagvjliqatfcbze4m2.IconCompatParcelizer() != r8lambdar7ywl9ynsudagvjliqatfcbze4m.IconCompatParcelizer()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdar7ywl9ynsudagvjliqatfcbze4m2.RemoteActionCompatParcelizer(), r8lambdar7ywl9ynsudagvjliqatfcbze4m.RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdar7ywl9ynsudagvjliqatfcbze4m2.read(), r8lambdar7ywl9ynsudagvjliqatfcbze4m.read()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{MediaSessionCompatQueueItem(), r8lambdazcbg_e0hjusjy78mvgh54swzqty.MediaSessionCompatQueueItem()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{RemoteActionCompatParcelizer(), r8lambdazcbg_e0hjusjy78mvgh54swzqty.RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        migrateTriggersReeligibilityToJsonlambda4<r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA> migratetriggersreeligibilitytojsonlambda5 = this.write;
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa = migratetriggersreeligibilitytojsonlambda5.read();
        String strSerializer = r8lambdazgdcm_k4mtbwe6bmdwjk2beesa != null ? r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.serializer() : null;
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa2 = migratetriggersreeligibilitytojsonlambda4.read();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strSerializer, r8lambdazgdcm_k4mtbwe6bmdwjk2beesa2 != null ? r8lambdazgdcm_k4mtbwe6bmdwjk2beesa2.serializer() : null}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa3 = migratetriggersreeligibilitytojsonlambda5.read();
        String strIconCompatParcelizer = r8lambdazgdcm_k4mtbwe6bmdwjk2beesa3 != null ? r8lambdazgdcm_k4mtbwe6bmdwjk2beesa3.IconCompatParcelizer() : null;
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa4 = migratetriggersreeligibilitytojsonlambda4.read();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strIconCompatParcelizer, r8lambdazgdcm_k4mtbwe6bmdwjk2beesa4 != null ? r8lambdazgdcm_k4mtbwe6bmdwjk2beesa4.IconCompatParcelizer() : null}, getCieXyz.write())).booleanValue();
    }

    public r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY(r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m, migrateTriggersReeligibilityToJsonlambda4<r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA> migratetriggersreeligibilitytojsonlambda4) {
        r8lambdar7ywl9ynsudagvjliqatfcbze4m.getClass();
        migratetriggersreeligibilitytojsonlambda4.getClass();
        this.IconCompatParcelizer = r8lambdar7ywl9ynsudagvjliqatfcbze4m;
        this.write = migratetriggersreeligibilitytojsonlambda4;
        migratetriggersreeligibilitytojsonlambda4.serializer();
    }

    public final r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY write(r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa) {
        return new r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY(this.IconCompatParcelizer, r8lambdazgdcm_k4mtbwe6bmdwjk2beesa);
    }

    public final r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY read() {
        r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m = this.IconCompatParcelizer;
        return new r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY(new r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M(r8lambdar7ywl9ynsudagvjliqatfcbze4m.RemoteActionCompatParcelizer(), r8lambdar7ywl9ynsudagvjliqatfcbze4m.read(), true, r8lambdar7ywl9ynsudagvjliqatfcbze4m.IconCompatParcelizer()), this.write);
    }

    public final r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY RemoteActionCompatParcelizer(r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m) {
        return new r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY(r8lambdar7ywl9ynsudagvjliqatfcbze4m, this.write);
    }
}
