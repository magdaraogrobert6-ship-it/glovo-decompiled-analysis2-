package o;

import com.incognia.internal.eQD;
import com.incognia.internal.uEN;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class loadHtmlData implements uEN, FwFClientKt {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ loadHtmlData(Object obj, Object obj2, Object obj3, Object obj4) {
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.write = obj3;
        this.serializer = obj4;
    }

    @Override // com.incognia.internal.uEN
    public void BGx(boolean z, List list) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        eQD.BGx((eQD) this.RemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read, (ArrayList) this.write, (List) this.serializer, z, list);
        int i4 = IconCompatParcelizer + 19;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.FwFClientKt
    public Object IconCompatParcelizer(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        qdExternalSyntheticLambda0 qdexternalsyntheticlambda0 = (qdExternalSyntheticLambda0) this.RemoteActionCompatParcelizer;
        Type type = (Type) this.read;
        Annotation[] annotationArr = (Annotation[]) this.write;
        getHoldoutVariation getholdoutvariation = (getHoldoutVariation) this.serializer;
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = (_get_messageWebView_lambda3) obj;
        _get_messagewebview_lambda3.getClass();
        Object objMediaSessionCompatResultReceiverWrapper = qdexternalsyntheticlambda0.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        Object objIconCompatParcelizer = ((ProtoFeatureMsggetHoldouts1) ((ProtoFeatureMsgCompanion) objMediaSessionCompatResultReceiverWrapper).read(type, annotationArr, getholdoutvariation)).IconCompatParcelizer(_get_messagewebview_lambda3);
        int i4 = IconCompatParcelizer + 33;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return objIconCompatParcelizer;
    }

    public void RemoteActionCompatParcelizer() {
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0;
        int i = 2;
        int i2 = 2 % 2;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda1 = (BrazeActionParserExternalSyntheticLambda0) this.RemoteActionCompatParcelizer;
        String str = (String) this.read;
        BrazeActionParser brazeActionParser = (BrazeActionParser) this.write;
        File file = (File) this.serializer;
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        brazeActionParserExternalSyntheticLambda1.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Started processing cached files from %s", str);
        handleCardClicklambda1 handlecardclicklambda1 = brazeActionParser.IconCompatParcelizer;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda2 = brazeActionParser.read;
        try {
            brazeActionParserExternalSyntheticLambda2.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Processing dir. %s", file.getAbsolutePath());
            int i3 = 0;
            File[] fileArrListFiles = file.listFiles(new r8lambda1rg5nswZ2w8tK6UoajTAHGu7Dc(0, brazeActionParser));
            if (fileArrListFiles == null) {
                brazeActionParserExternalSyntheticLambda2.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
            } else {
                brazeActionParserExternalSyntheticLambda2.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
                int length = fileArrListFiles.length;
                int i4 = 0;
                while (i4 < length) {
                    File file2 = fileArrListFiles[i4];
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!handlecardclicklambda1.contains(absolutePath)) {
                            io.sentry.transport.PlaybackStateCompat playbackStateCompatWrite = brazeActionParser.RemoteActionCompatParcelizer.write();
                            if (playbackStateCompatWrite != null && playbackStateCompatWrite.serializer(openUriWithActionViewFromPush.All)) {
                                int i5 = IconCompatParcelizer + 11;
                                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i5 % i != 0) {
                                    brazeActionParserExternalSyntheticLambda2.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "DirectoryProcessor, rate limiting active.", new Object[i3]);
                                    break;
                                } else {
                                    brazeActionParserExternalSyntheticLambda2.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "DirectoryProcessor, rate limiting active.", new Object[i3]);
                                    break;
                                }
                            }
                            brazeActionParserExternalSyntheticLambda2.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Processing file: %s", absolutePath);
                            brazeActionParserExternalSyntheticLambda0 = brazeActionParserExternalSyntheticLambda1;
                            try {
                                brazeActionParser.serializer(file2, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(new r8lambdaAHg7GxSREelZY1m8VqK5C6Qd4(brazeActionParser.write, brazeActionParser.read, absolutePath, handlecardclicklambda1)));
                                Thread.sleep(100L);
                            } catch (Throwable th) {
                                th = th;
                                brazeActionParserExternalSyntheticLambda2.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
                                int i6 = IconCompatParcelizer + 87;
                                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Finished processing cached files from %s", str);
                            }
                        } else {
                            brazeActionParserExternalSyntheticLambda2.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                        }
                        i4++;
                        brazeActionParserExternalSyntheticLambda1 = brazeActionParserExternalSyntheticLambda0;
                        fileArrListFiles = fileArrListFiles;
                        i = 2;
                        i3 = 0;
                    } else {
                        brazeActionParserExternalSyntheticLambda2.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    }
                    brazeActionParserExternalSyntheticLambda0 = brazeActionParserExternalSyntheticLambda1;
                    i4++;
                    brazeActionParserExternalSyntheticLambda1 = brazeActionParserExternalSyntheticLambda0;
                    fileArrListFiles = fileArrListFiles;
                    i = 2;
                    i3 = 0;
                }
            }
            brazeActionParserExternalSyntheticLambda0 = brazeActionParserExternalSyntheticLambda1;
        } catch (Throwable th2) {
            th = th2;
            brazeActionParserExternalSyntheticLambda0 = brazeActionParserExternalSyntheticLambda1;
        }
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Finished processing cached files from %s", str);
    }
}
