package o;

import com.huawei.hms.support.api.client.PendingResultsCreator;
import io.sentry.SentryEnvelopeItem;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.text.RegexKt;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class isArgOptionalJsonObject extends BrazeActionParser {
    public static final Charset serializer = Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public final AddToCustomAttributeArrayStep MediaDescriptionCompat;
    public final BrazeActionParserExternalSyntheticLambda0 MediaMetadataCompat;
    public final BaseBrazeActionStep MediaSessionCompatQueueItem;
    public final BrazeActionParserActionType RatingCompat;

    public static /* synthetic */ void IconCompatParcelizer(isArgOptionalJsonObject isargoptionaljsonobject, File file, io.sentry.hints.MediaDescriptionCompat mediaDescriptionCompat) {
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = isargoptionaljsonobject.MediaMetadataCompat;
        if (mediaDescriptionCompat.read()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    public final boolean read(executelambda4 executelambda4Var) {
        Object obj = executelambda4Var.read("sentry:typeCheckHint");
        if (obj instanceof io.sentry.hints.MediaMetadataCompat) {
            return ((io.sentry.hints.MediaMetadataCompat) obj).C_();
        }
        io.sentry.util.RatingCompat.serializer(io.sentry.hints.MediaMetadataCompat.class, obj, this.MediaMetadataCompat);
        return true;
    }

    public final _get_messageWebView_lambda0 serializer(r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu) {
        String str;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.MediaMetadataCompat;
        if (r8lambdazwumnezi8cq9pp6w1bgke7nfwtu != null && (str = r8lambdazwumnezi8cq9pp6w1bgke7nfwtu.MediaSessionCompatQueueItem) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (RegexKt.write(dValueOf, false)) {
                    String str2 = r8lambdazwumnezi8cq9pp6w1bgke7nfwtu.serializer;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (RegexKt.write(dValueOf2, false)) {
                            return new _get_messageWebView_lambda0(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    Object[] objArr = {new _get_messageWebView_lambda0(Boolean.TRUE, dValueOf)};
                    return (_get_messageWebView_lambda0) RegexKt.RemoteActionCompatParcelizer(PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), 551044531, objArr, -551044529, PendingResultsCreator.InstantPendingResult.serializer());
                }
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new _get_messageWebView_lambda0(Boolean.TRUE, null);
    }

    public isArgOptionalJsonObject(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, BrazeActionParserActionType brazeActionParserActionType, BaseBrazeActionStep baseBrazeActionStep, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, long j, int i) {
        super(addToCustomAttributeArrayStep, brazeActionParserExternalSyntheticLambda0, j, i);
        setNativeShader.read(addToCustomAttributeArrayStep, "Scopes are required.");
        this.MediaDescriptionCompat = addToCustomAttributeArrayStep;
        setNativeShader.read(brazeActionParserActionType, "Envelope reader is required.");
        this.RatingCompat = brazeActionParserActionType;
        setNativeShader.read(baseBrazeActionStep, "Serializer is required.");
        this.MediaSessionCompatQueueItem = baseBrazeActionStep;
        setNativeShader.read(brazeActionParserExternalSyntheticLambda0, "Logger is required.");
        this.MediaMetadataCompat = brazeActionParserExternalSyntheticLambda0;
    }

    @Override // o.BrazeActionParser
    public final void serializer(File file, executelambda4 executelambda4Var) {
        boolean zSerializer = serializer(file.getName());
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.MediaMetadataCompat;
        try {
            if (!zSerializer) {
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    OkHttpCall$1 okHttpCall$1Write = this.RatingCompat.write(bufferedInputStream);
                    if (okHttpCall$1Write == null) {
                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        write(okHttpCall$1Write, executelambda4Var);
                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object obj = executelambda4Var.read("sentry:typeCheckHint");
                    if (!io.sentry.hints.MediaDescriptionCompat.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) || obj == null) {
                        io.sentry.util.RatingCompat.serializer(io.sentry.hints.MediaDescriptionCompat.class, obj, brazeActionParserExternalSyntheticLambda0);
                    } else {
                        IconCompatParcelizer(this, file, (io.sentry.hints.MediaDescriptionCompat) obj);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error processing envelope.", e);
                Object obj2 = executelambda4Var.read("sentry:typeCheckHint");
                if (!io.sentry.hints.MediaDescriptionCompat.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) || obj2 == null) {
                    io.sentry.util.RatingCompat.serializer(io.sentry.hints.MediaDescriptionCompat.class, obj2, brazeActionParserExternalSyntheticLambda0);
                } else {
                    IconCompatParcelizer(this, file, (io.sentry.hints.MediaDescriptionCompat) obj2);
                }
            }
        } catch (Throwable th3) {
            Object obj3 = executelambda4Var.read("sentry:typeCheckHint");
            if (!io.sentry.hints.MediaDescriptionCompat.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) || obj3 == null) {
                io.sentry.util.RatingCompat.serializer(io.sentry.hints.MediaDescriptionCompat.class, obj3, brazeActionParserExternalSyntheticLambda0);
            } else {
                IconCompatParcelizer(this, file, (io.sentry.hints.MediaDescriptionCompat) obj3);
            }
            throw th3;
        }
    }

    @Override // o.BrazeActionParser
    public final boolean serializer(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x026f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0297 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x029e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void write(OkHttpCall$1 okHttpCall$1, executelambda4 executelambda4Var) {
        int size;
        Iterator it;
        Object obj;
        Throwable th;
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        Iterable iterable = (Iterable) okHttpCall$1.serializer;
        setOnDismissCallback setondismisscallback = (setOnDismissCallback) okHttpCall$1.write;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it2 = iterable.iterator();
            int i = 0;
            while (it2.hasNext()) {
                it2.next();
                i++;
            }
            size = i;
        }
        Object[] objArr = {Integer.valueOf(size)};
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.MediaMetadataCompat;
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Processing Envelope with %d item(s)", objArr);
        int i2 = 0;
        for (Iterator it3 = iterable.iterator(); it3.hasNext(); it3 = it) {
            SentryEnvelopeItem sentryEnvelopeItem = (SentryEnvelopeItem) it3.next();
            int i3 = i2 + 1;
            BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda0 = sentryEnvelopeItem.RemoteActionCompatParcelizer;
            BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda1 = sentryEnvelopeItem.RemoteActionCompatParcelizer;
            if (bannerViewExternalSyntheticLambda0 == null) {
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Item %d has no header", Integer.valueOf(i3));
                it = it3;
            } else {
                boolean zEquals = r8lambdaB2EfoRxiN347_5B93fxdQV0g.Event.equals(bannerViewExternalSyntheticLambda0.MediaMetadataCompat);
                BaseBrazeActionStep baseBrazeActionStep = this.MediaSessionCompatQueueItem;
                Charset charset = serializer;
                AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.MediaDescriptionCompat;
                it = it3;
                if (zEquals) {
                    try {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.IconCompatParcelizer()), charset));
                            try {
                                BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2 = (BannerViewExternalSyntheticLambda2) baseBrazeActionStep.write(bufferedReader, BannerViewExternalSyntheticLambda2.class);
                                if (bannerViewExternalSyntheticLambda2 == null) {
                                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i3), bannerViewExternalSyntheticLambda1.MediaMetadataCompat);
                                } else {
                                    io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = bannerViewExternalSyntheticLambda2.PlaybackStateCompat;
                                    if (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 != null) {
                                        String str = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.RemoteActionCompatParcelizer;
                                        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
                                            executelambda4Var.RemoteActionCompatParcelizer("sentry:isFromHybridSdk", Boolean.TRUE);
                                        }
                                    }
                                    io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = setondismisscallback.write;
                                    if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg != null && !r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.equals(bannerViewExternalSyntheticLambda2.MediaMetadataCompat)) {
                                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i3), setondismisscallback.write, bannerViewExternalSyntheticLambda2.MediaMetadataCompat);
                                        bufferedReader.close();
                                    } else {
                                        addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(bannerViewExternalSyntheticLambda2, executelambda4Var);
                                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Item %d is being captured.", Integer.valueOf(i3));
                                        if (!read(executelambda4Var)) {
                                            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Timed out waiting for event id submission: %s", bannerViewExternalSyntheticLambda2.MediaMetadataCompat);
                                            bufferedReader.close();
                                            return;
                                        }
                                    }
                                    th = th;
                                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Item failed to process.", th);
                                    obj = executelambda4Var.read("sentry:typeCheckHint");
                                    if (!(obj instanceof io.sentry.hints.MediaSessionCompatToken) && !((io.sentry.hints.MediaSessionCompatToken) obj).RemoteActionCompatParcelizer()) {
                                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i3));
                                        return;
                                    }
                                    Object obj2 = executelambda4Var.read("sentry:typeCheckHint");
                                    if (!io.sentry.android.core.addObserverForBackInvoker.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) && obj2 != null) {
                                        ((io.sentry.android.core.addObserverForBackInvoker) obj2).serializer();
                                    }
                                }
                                bufferedReader.close();
                                obj = executelambda4Var.read("sentry:typeCheckHint");
                                if (!(obj instanceof io.sentry.hints.MediaSessionCompatToken)) {
                                }
                                Object obj3 = executelambda4Var.read("sentry:typeCheckHint");
                                if (!io.sentry.android.core.addObserverForBackInvoker.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
                                }
                            } catch (Throwable th2) {
                                try {
                                    bufferedReader.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } else {
                    r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g = r8lambdaB2EfoRxiN347_5B93fxdQV0g.Transaction;
                    r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g2 = bannerViewExternalSyntheticLambda0.MediaMetadataCompat;
                    r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g3 = bannerViewExternalSyntheticLambda0.MediaMetadataCompat;
                    if (r8lambdab2eforxin347_5b93fxdqv0g.equals(r8lambdab2eforxin347_5b93fxdqv0g2)) {
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.IconCompatParcelizer()), charset));
                            try {
                                io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore = (io.sentry.protocol.accessensureViewModelStore) baseBrazeActionStep.write(bufferedReader2, io.sentry.protocol.accessensureViewModelStore.class);
                                if (accessensureviewmodelstore == null) {
                                    try {
                                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i3), bannerViewExternalSyntheticLambda1.MediaMetadataCompat);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        try {
                                            bufferedReader2.close();
                                            throw th;
                                        } catch (Throwable th7) {
                                            th.addSuppressed(th7);
                                            throw th;
                                        }
                                    }
                                } else {
                                    io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = setondismisscallback.write;
                                    if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 != null && !r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2.equals(accessensureviewmodelstore.MediaMetadataCompat)) {
                                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i3), setondismisscallback.write, accessensureviewmodelstore.MediaMetadataCompat);
                                        bufferedReader2.close();
                                    } else {
                                        r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu = setondismisscallback.read;
                                        if (accessensureviewmodelstore.read.MediaSessionCompatQueueItem() != null) {
                                            accessensureviewmodelstore.read.MediaSessionCompatQueueItem().IconCompatParcelizer(serializer(r8lambdazwumnezi8cq9pp6w1bgke7nfwtu));
                                        }
                                        addToCustomAttributeArrayStep.IconCompatParcelizer(accessensureviewmodelstore, r8lambdazwumnezi8cq9pp6w1bgke7nfwtu, executelambda4Var, null);
                                        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco2 = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                                        Object[] objArr2 = new Object[1];
                                        try {
                                            objArr2[0] = Integer.valueOf(i3);
                                            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco2, "Item %d is being captured.", objArr2);
                                            if (!read(executelambda4Var)) {
                                                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Timed out waiting for event id submission: %s", accessensureviewmodelstore.MediaMetadataCompat);
                                                bufferedReader2.close();
                                                return;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            th = th;
                                            bufferedReader2.close();
                                            throw th;
                                        }
                                    }
                                }
                                try {
                                    bufferedReader2.close();
                                } catch (Throwable th9) {
                                    th = th9;
                                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Item failed to process.", th);
                                }
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                        }
                    } else {
                        addToCustomAttributeArrayStep.write(new OkHttpCall$1(setondismisscallback.write, setondismisscallback.IconCompatParcelizer, sentryEnvelopeItem), executelambda4Var);
                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "%s item %d is being captured.", r8lambdab2eforxin347_5b93fxdqv0g3.getItemType(), Integer.valueOf(i3));
                        if (!read(executelambda4Var)) {
                            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Timed out waiting for item type submission: %s", r8lambdab2eforxin347_5b93fxdqv0g3.getItemType());
                            return;
                        }
                    }
                    obj = executelambda4Var.read("sentry:typeCheckHint");
                    if (!(obj instanceof io.sentry.hints.MediaSessionCompatToken)) {
                    }
                    Object obj4 = executelambda4Var.read("sentry:typeCheckHint");
                    if (!io.sentry.android.core.addObserverForBackInvoker.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
                    }
                }
                i2 = i3;
            }
            i2 = i3;
        }
    }
}
