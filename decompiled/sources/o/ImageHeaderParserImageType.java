package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.LogWriterBackend;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import io.sentry.metrics.MetricsBatchProcessor;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import okio.Path$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageHeaderParserImageType implements getPlacementScope, LogWriterBackend, runGuardedAsyncandroid_sdk_base_release, io.sentry.util.runtime.IconCompatParcelizer {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public ImageHeaderParserImageType(accessisMainThread accessismainthread, Path$Companion path$Companion) {
    }

    @Override // io.sentry.util.runtime.IconCompatParcelizer
    public Object RemoteActionCompatParcelizer(io.sentry.util.runtime.read readVar) {
        int i = 2 % 2;
        int i2 = serializer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objA_ = readVar.A_();
        int i4 = serializer + 85;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objA_;
    }

    @Override // io.sentry.util.runtime.IconCompatParcelizer
    public void serializer(f$$ExternalSyntheticLambda1 f__externalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = serializer + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        f__externalsyntheticlambda1.run();
        int i4 = IconCompatParcelizer + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static RequestBuilder IconCompatParcelizer(byte... bArr) {
        int i = 2 % 2;
        bArr.getClass();
        RequestBuilder requestBuilder = new RequestBuilder(Arrays.copyOf(bArr, bArr.length));
        int i2 = serializer + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return requestBuilder;
    }

    public static RequestBuilder serializer(String str) {
        int i = 2 % 2;
        str.getClass();
        byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
        bytes.getClass();
        RequestBuilder requestBuilder = new RequestBuilder(bytes);
        requestBuilder.utf8 = str;
        int i2 = serializer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return requestBuilder;
    }

    public static RequestBuilder read(byte[] bArr) {
        int i = 2 % 2;
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        int length = bArr.length;
        setOptionalTextView.RemoteActionCompatParcelizer(bArr.length, 0L, length);
        RequestBuilder requestBuilder2 = new RequestBuilder(onContentCardClicked.IconCompatParcelizer(bArr, 0, length));
        int i2 = serializer + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return requestBuilder2;
    }

    public DragAndDropTargetModifierNode RemoteActionCompatParcelizer(schedulePushDeliveryandroid_sdk_base_release schedulepushdeliveryandroid_sdk_base_release, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        int i = 2 % 2;
        schedulepushdeliveryandroid_sdk_base_release.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new LoadingFloatingButtonKt$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, schedulepushdeliveryandroid_sdk_base_release, this), true, -847179641);
        int i2 = IconCompatParcelizer + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return dragAndDropTargetModifierNode;
    }

    @Override // o.getPlacementScope
    public Object create(MetricsBatchProcessor metricsBatchProcessor) {
        int i = 2 % 2;
        AndroidViewConfiguration androidViewConfiguration = new AndroidViewConfiguration(metricsBatchProcessor.write(getMaximumFlingVelocity.class));
        int i2 = serializer + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
        return androidViewConfiguration;
    }

    public static void serializer(androidx.fragment.app.FragmentActivity fragmentActivity, CashPaymentTaskUiItem.Reasons reasons, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        fragmentActivity.getClass();
        reasons.getClass();
        getEnd.IconCompatParcelizer(reasons).RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "TAG_AMOUNT_CHANGING_REASONS");
        fragmentActivity.getSupportFragmentManager().read("TAG_AMOUNT_CHANGING_REASONS", fragmentActivity, new ArrivalProgressObserver$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 17, fragmentActivity));
        int i2 = IconCompatParcelizer + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.mapbox.common.LogWriterBackend
    public void writeLog(LoggingLevel loggingLevel, String str) {
        int i = 2 % 2;
        int i2 = serializer + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        loggingLevel.getClass();
        str.getClass();
        int i4 = k5.RemoteActionCompatParcelizer[loggingLevel.ordinal()];
        if (i4 == 1) {
            Timber.RemoteActionCompatParcelizer.getClass();
            return;
        }
        int i5 = serializer;
        int i6 = i5 + 65;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0 ? i4 == 2 : i4 == 3) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(str, new Object[0]);
            int i7 = IconCompatParcelizer + 19;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return;
        }
        if (i4 == 3) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, new Object[0]);
            return;
        }
        int i9 = i5 + 103;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        if (i4 == 4) {
            Timber.RemoteActionCompatParcelizer.read(str, new Object[0]);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
    }

    public static RequestBuilder write(String str) {
        int i = 2 % 2;
        int i2 = serializer + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0 ? str.length() % 2 != 0 : (str.length() >>> 3) != 0) {
            DrawableTransformation.serializer((Object) "Unexpected hex string: ".concat(str));
            int i3 = serializer + 11;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            Object obj = null;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = IconCompatParcelizer + 63;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i6 * 2;
            bArr[i6] = (byte) (setNativeShader.serializer(str.charAt(i7 + 1)) + (setNativeShader.serializer(str.charAt(i7)) << 4));
        }
        return new RequestBuilder(bArr);
    }

    public static Serializable serializer(BufferedInputStream bufferedInputStream) {
        int i = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        do {
            try {
                int i4 = bufferedInputStream.read();
                if (i4 == -1) {
                    if (byteArrayOutputStream.size() == 0) {
                        return new isItemDismissable(new EOFException("Client closed connection while reading a header line"));
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    return new String(byteArray, ensureSubscribedToInAppMessageEvents.IconCompatParcelizer);
                }
                if (i4 == 10) {
                    int i5 = serializer + 123;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    byteArray2.getClass();
                    return new String(byteArray2, 0, (byteArray2.length != 0 && byteArray2[byteArray2.length + (-1)] == 13) ? byteArray2.length - 1 : byteArray2.length, ensureSubscribedToInAppMessageEvents.IconCompatParcelizer);
                }
                byteArrayOutputStream.write(i4);
            } catch (IOException e) {
                return new isItemDismissable(e);
            }
        } while (byteArrayOutputStream.size() <= 8192);
        return new isItemDismissable(new IOException("HTTP line exceeds 8192 bytes"));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    public static RequestBuilder RemoteActionCompatParcelizer(String str) {
        int i;
        int i2;
        int i3 = 2 % 2;
        str.getClass();
        byte[] bArr = BaseCardViewCompanion.RemoteActionCompatParcelizer;
        int length = str.length();
        while (true) {
            char c = '\n';
            if (length > 0) {
                char cCharAt = str.charAt(length - 1);
                if (cCharAt != '=') {
                    int i4 = IconCompatParcelizer;
                    int i5 = i4 + 7;
                    serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        if (cCharAt == 'k') {
                            continue;
                        } else if (cCharAt != '\r' && cCharAt != ' ') {
                            int i6 = i4 + 47;
                            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            serializer = i7;
                            if (i6 % 2 != 0) {
                                if (cCharAt != 'D') {
                                    i2 = i7 + 75;
                                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i2 % 2 == 0) {
                                        int i8 = 2 % 4;
                                    }
                                }
                            } else if (cCharAt != '\t') {
                                i2 = i7 + 75;
                                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i2 % 2 == 0) {
                                    int i9 = 2 % 4;
                                }
                            }
                        }
                    } else if (cCharAt == '\n') {
                        continue;
                    } else if (cCharAt != '\r') {
                        continue;
                    }
                }
                length--;
            }
            int i10 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i10];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i11 >= length) {
                    int i15 = i12 % 4;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            int i16 = serializer + 81;
                            IconCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i16 % 2 != 0 ? i15 == 3 : i15 == 5) {
                                int i17 = i13 << 6;
                                bArrCopyOf[i14] = (byte) (i17 >> 16);
                                bArrCopyOf[i14 + 1] = (byte) (i17 >> 8);
                                i14 += 2;
                            }
                        } else {
                            bArrCopyOf[i14] = (byte) ((i13 << 12) >> 16);
                            i14++;
                        }
                        if (i14 == i10) {
                            break;
                        }
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                        break;
                    }
                } else {
                    char cCharAt2 = str.charAt(i11);
                    if ('A' <= cCharAt2 && cCharAt2 < '[') {
                        i = cCharAt2 - 'A';
                    } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                        i = cCharAt2 - 'G';
                    } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                        i = cCharAt2 + 4;
                    } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                        i = 62;
                    } else {
                        if (cCharAt2 == '/' || cCharAt2 == '_') {
                            i = 63;
                        } else if (cCharAt2 != c) {
                            int i18 = serializer + 9;
                            int i19 = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            IconCompatParcelizer = i19;
                            if (i18 % 2 == 0) {
                                if (cCharAt2 == 'N') {
                                    continue;
                                } else if (cCharAt2 == ' ') {
                                    continue;
                                } else if (cCharAt2 == '\t') {
                                    int i20 = i19 + 33;
                                    serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i21 = i20 % 2;
                                }
                            } else if (cCharAt2 == '\r') {
                                continue;
                            } else if (cCharAt2 == ' ') {
                                continue;
                            } else if (cCharAt2 == '\t') {
                                int i22 = i19 + 33;
                                serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i23 = i22 % 2;
                            }
                        } else {
                            continue;
                        }
                        i11++;
                        c = '\n';
                    }
                    i13 = (i13 << 6) | i;
                    i12++;
                    if (i12 % 4 == 0) {
                        bArrCopyOf[i14] = (byte) (i13 >> 16);
                        bArrCopyOf[i14 + 1] = (byte) (i13 >> 8);
                        bArrCopyOf[i14 + 2] = (byte) i13;
                        i14 += 3;
                    }
                    i11++;
                    c = '\n';
                }
                bArrCopyOf = null;
                break;
            }
            if (bArrCopyOf != null) {
                return new RequestBuilder(bArrCopyOf);
            }
            int i24 = IconCompatParcelizer + 17;
            serializer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i24 % 2 == 0) {
                return null;
            }
            int i25 = 14 / 0;
            return null;
        }
    }

    public ImageHeaderParserImageType() {
    }
}
