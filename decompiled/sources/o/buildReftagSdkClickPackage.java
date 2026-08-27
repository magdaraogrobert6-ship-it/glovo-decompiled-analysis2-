package o;

import com.roadrunner.rider.state.quests.presentation.list.QuestListItemKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class buildReftagSdkClickPackage implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ addMapJson RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ buildReftagSdkClickPackage(addMapJson addmapjson, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.RemoteActionCompatParcelizer = addmapjson;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = modifier;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 73;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.write;
        androidx.compose.ui.Modifier modifier = this.IconCompatParcelizer;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.read;
        addMapJson addmapjson = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 != 0) {
            QuestListItemKt.QuestListItemColumn(addmapjson, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        QuestListItemKt.QuestListItem(addmapjson, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaMetadataCompat + 117;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
