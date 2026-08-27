package o;

import com.huawei.location.nlp.network.OnlineLocationService;

/* JADX INFO: loaded from: classes4.dex */
public interface TranslationsENABLEDCompanion {
    public static final getNetworkModule IconCompatParcelizer;
    public static final getNetworkModule MediaDescriptionCompat;
    public static final getNetworkModule MediaMetadataCompat;
    public static final getNetworkModule MediaSessionCompatQueueItem;
    public static final getNetworkModule RatingCompat;
    public static final getNetworkModule RemoteActionCompatParcelizer;
    public static final getNetworkModule read;
    public static final getNetworkModule serializer;
    public static final getNetworkModule write;

    static {
        getNetworkModule getnetworkmodule = new getNetworkModule("2.16.840.1.101.3.4");
        getNetworkModule getnetworkmoduleIconCompatParcelizer = getnetworkmodule.IconCompatParcelizer("2");
        read = getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("1");
        RemoteActionCompatParcelizer = getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("2");
        serializer = getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("3");
        IconCompatParcelizer = getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer(OnlineLocationService.SRC_DEFAULT);
        getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("5");
        RatingCompat = getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("6");
        getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("7");
        write = getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("8");
        getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("9");
        getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("10");
        MediaDescriptionCompat = getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("11");
        MediaMetadataCompat = getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("12");
        TranslationsCompanion.write(getnetworkmoduleIconCompatParcelizer, "13", "14", "15", "16");
        getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("17");
        MediaSessionCompatQueueItem = getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("18");
        getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("19");
        getnetworkmoduleIconCompatParcelizer.IconCompatParcelizer("20");
        getNetworkModule getnetworkmoduleIconCompatParcelizer2 = getnetworkmodule.IconCompatParcelizer("1");
        TranslationsCompanion.write(getnetworkmoduleIconCompatParcelizer2, "1", "2", "3", OnlineLocationService.SRC_DEFAULT);
        TranslationsCompanion.write(getnetworkmoduleIconCompatParcelizer2, "5", "6", "7", "8");
        TranslationsCompanion.write(getnetworkmoduleIconCompatParcelizer2, "9", "21", "22", "23");
        TranslationsCompanion.write(getnetworkmoduleIconCompatParcelizer2, "24", "25", "26", "27");
        TranslationsCompanion.write(getnetworkmoduleIconCompatParcelizer2, "28", "29", "41", "42");
        TranslationsCompanion.write(getnetworkmoduleIconCompatParcelizer2, "43", "44", "45", "46");
        getnetworkmoduleIconCompatParcelizer2.IconCompatParcelizer("47");
        getnetworkmoduleIconCompatParcelizer2.IconCompatParcelizer("48");
        getnetworkmoduleIconCompatParcelizer2.IconCompatParcelizer("49");
        getNetworkModule getnetworkmoduleIconCompatParcelizer3 = getnetworkmodule.IconCompatParcelizer("3");
        getnetworkmoduleIconCompatParcelizer3.IconCompatParcelizer("1");
        getnetworkmoduleIconCompatParcelizer3.IconCompatParcelizer("2");
        getnetworkmoduleIconCompatParcelizer3.IconCompatParcelizer("3");
        TranslationsCompanion.write(getnetworkmoduleIconCompatParcelizer3, OnlineLocationService.SRC_DEFAULT, "5", "6", "7");
        TranslationsCompanion.write(getnetworkmoduleIconCompatParcelizer3, "8", "9", "10", "11");
        TranslationsCompanion.write(getnetworkmoduleIconCompatParcelizer3, "12", "13", "14", "15");
        getnetworkmoduleIconCompatParcelizer3.IconCompatParcelizer("16");
    }
}
