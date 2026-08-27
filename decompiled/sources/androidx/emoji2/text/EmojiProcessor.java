package androidx.emoji2.text;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.PersistableBundle;
import android.security.keystore.KeyGenParameterSpec;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatTextHelper$1;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.d4$$ExternalSyntheticLambda2;
import bo.app.n5;
import coil3.ComponentRegistry$Builder;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.memory.MemoryCacheService;
import coil3.util.IntPair;
import com.adjust.sdk.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.internal.concurrency.SerialCoroutineWorker$2;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.gms.dynamite.zzj;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import io.sentry.CombinedScopeView;
import io.sentry.metrics.MetricsBatchProcessor;
import io.sentry.util.MediaBrowserCompatMediaItem;
import io.sentry.util.UrlUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import javax.crypto.KeyGenerator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.AndroidShadowContext_androidKt;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.BlurFilter;
import o.BrazeExternalSyntheticLambda45;
import o.ColorFilterCompanion;
import o.DistanceAndFlagsdefault;
import o.DragAndDropNodeKtfirstDescendantOrNull1;
import o.DragAndDropNodeacceptDragAndDropTransfer1;
import o.FocusListener;
import o.FocusOwnerImplfocusSearch1;
import o.FragmentSavedState;
import o.IInAppMessageViewWrapper;
import o.ImageVector;
import o.LayoutModifierNodeKt;
import o.MutableRect3MmeM6k;
import o.OffsetCompanion;
import o.RotateKt;
import o.StrokeCompanion;
import o.TextGranularity;
import o.WrongNestedHierarchyViolation;
import o.accessDistanceAndFlags;
import o.accessdispatchEntered;
import o.accessgetBrowsercp;
import o.accessgetCharactercp;
import o.accessgetDefaultJoincp;
import o.accessgetEightcp;
import o.accessgetInsertcp;
import o.accessgetJcp;
import o.accessgetKanacp;
import o.accessgetLookaheadAndAncestorMeasureSetp;
import o.accessgetMediaPlayPausecp;
import o.accessgetSystemNavigationDowncp;
import o.accessisMainThread;
import o.accessstripNonMetricAffectingCharacterStyleSpans;
import o.containsUv8p0NA;
import o.copyO0kMr_c;
import o.copyRetOiIg;
import o.createFromParcel;
import o.createGraphemeClusterSegmentFinder;
import o.divtuRUvjQ;
import o.ensureSubDecor;
import o.fastMapTo;
import o.fillStringBounds;
import o.getActionViewIntentlambda0;
import o.getAlignmentLinesMap;
import o.getButtonThumbLeftEK5gGoQ;
import o.getChildViewHolderInt;
import o.getCieXyz;
import o.getColorIntegerOrNull;
import o.getContentViewGroupParentLayout;
import o.getDistanceimpl;
import o.getDoubleOrNull;
import o.getFiveEK5gGoQ;
import o.getFocusEK5gGoQ;
import o.getInvalidateListenerui;
import o.getJoinLxFBmk8;
import o.getMaximumhdzbrEE;
import o.getNotPlacedPlaceOrderuiannotations;
import o.getOuterCoordinatorui;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getSafeGestures;
import o.getSharedElementTargetNames;
import o.getSoftWrap;
import o.getUseIntrinsicSize;
import o.getWrappedNonNull;
import o.getZSortedChildrenannotations;
import o.hasHit;
import o.hasSpecifiedAndFiniteHeightuvyYCjk;
import o.hitExpandedTouchBounds;
import o.invalidateSemanticsui;
import o.isAdapterPositionOnScreen;
import o.isInBackStack;
import o.isMainThread;
import o.isMenuVisible;
import o.isSemanticsInvalidatedui;
import o.isTintable;
import o.isValidimpl;
import o.lastIndexOf;
import o.lightingOWjLjI;
import o.listIterator;
import o.markItemDecorInsetsDirty;
import o.markTintForColor8_81llA;
import o.mergeJsonObjects;
import o.minLookaheadIntrinsicHeight;
import o.nextFloat;
import o.onAfterPlaceAt;
import o.onHiddenChanged;
import o.onOptionsItemSelected;
import o.parseFourDigits;
import o.plusMKHz9U;
import o.populateFocusOrder;
import o.provideInsetsValuescytEWk0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeFirst;
import o.removeLast;
import o.removeNodeAtDepth;
import o.removeNodesInRange;
import o.requestFocusBypassUnfocusableComposeView;
import o.requestRemeasureui;
import o.rotate;
import o.sendContentCaptureTextUpdateEvent;
import o.setAlignment;
import o.setDrawDisappearingViewsLast;
import o.setLayoutModifierNodeui;
import o.setLeft;
import o.setLineBreakConfig;
import o.setNativeBlendModeGB0RdKg;
import o.setNextChildPlaceOrderui;
import o.setPopDirection;
import o.setPresentationView;
import o.setRootFocusNodeui;
import o.setRotation;
import o.setSharedElementEnterTransition;
import o.setSharedElementReturnTransition;
import o.snapToTargetExistingView;
import o.sort;
import o.tintxETnrdsdefault;
import o.trackEventI;
import o.transferSessionPackageI;
import o.unaryMinusF1C5BW0;
import o.updateMatrix;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public class EmojiProcessor implements setRootFocusNodeui, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, getSafeGestures {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public Object IconCompatParcelizer;
    public Object read;
    public Object serializer;
    public final /* synthetic */ int write;

    public lightingOWjLjI read() {
        tintxETnrdsdefault tintxetnrdsdefault = (tintxETnrdsdefault) this.IconCompatParcelizer;
        if (tintxetnrdsdefault == null && ((KeyGenParameterSpec) this.read) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("build() called before setKeyGenParameterSpec or setKeyScheme.");
            return null;
        }
        if (tintxetnrdsdefault == tintxETnrdsdefault.AES256_GCM) {
            this.read = new KeyGenParameterSpec.Builder((String) this.serializer, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(Fields.RotationX).build();
        }
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.read;
        if (keyGenParameterSpec == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("KeyGenParameterSpec was null after build() check");
            return null;
        }
        Object obj = ColorFilterCompanion.RemoteActionCompatParcelizer;
        if (keyGenParameterSpec.getKeySize() != 256) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(keyGenParameterSpec.getKeySize(), "invalid key size, want 256 bits got ", " bits");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(Arrays.toString(keyGenParameterSpec.getBlockModes()), "invalid block mode, want GCM got ");
            return null;
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()), "invalid padding mode, want NoPadding got ");
            return null;
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            return null;
        }
        synchronized (ColorFilterCompanion.RemoteActionCompatParcelizer) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpec);
                    keyGenerator.generateKey();
                } catch (ProviderException e) {
                    throw new GeneralSecurityException(e.getMessage(), e);
                }
            }
        }
        return new lightingOWjLjI(keyGenParameterSpec.getKeystoreAlias(), (KeyGenParameterSpec) this.read);
    }

    public Drawable write(int i) {
        int resourceId;
        Drawable drawableIconCompatParcelizer;
        if (!((TypedArray) this.read).hasValue(i) || (resourceId = ((TypedArray) this.read).getResourceId(i, 0)) == 0) {
            return null;
        }
        ensureSubDecor ensuresubdecorWrite = ensureSubDecor.write();
        Context context = (Context) this.serializer;
        synchronized (ensuresubdecorWrite) {
            drawableIconCompatParcelizer = ensuresubdecorWrite.write.IconCompatParcelizer(context, resourceId, true);
        }
        return drawableIconCompatParcelizer;
    }

    public setRotation serializer(String str, isTintable istintable) {
        istintable.getClass();
        EmojiProcessor emojiProcessor = istintable == isTintable.EXCLUSIVE ? (EmojiProcessor) this.read : (EmojiProcessor) this.IconCompatParcelizer;
        emojiProcessor.getClass();
        synchronized (emojiProcessor.serializer) {
            ImageVector imageVector = (ImageVector) ((LinkedHashMap) emojiProcessor.read).get(str);
            if (imageVector == null) {
                return new setRotation(0L, 0L, 0L, 0L);
            }
            return new setRotation(imageVector.IconCompatParcelizer, imageVector.read, imageVector.write, imageVector.serializer);
        }
    }

    public void serializer(String str, setNativeBlendModeGB0RdKg setnativeblendmodegb0rdkg, int i, requestFocusBypassUnfocusableComposeView requestfocusbypassunfocusablecomposeview) {
        Object obj;
        str.getClass();
        requestfocusbypassunfocusablecomposeview.getClass();
        synchronized (this.serializer) {
            if (((LinkedHashSet) this.IconCompatParcelizer).contains(str)) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.read;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    obj = obj2;
                    ImageVector imageVector = new ImageVector();
                    imageVector.IconCompatParcelizer = 0L;
                    imageVector.read = 0L;
                    imageVector.write = 0L;
                    imageVector.serializer = 0L;
                    linkedHashMap.put(str, imageVector);
                    obj = imageVector;
                }
                obj = obj2;
                ImageVector imageVector2 = (ImageVector) obj;
                imageVector2.IconCompatParcelizer++;
                if (setnativeblendmodegb0rdkg.RemoteActionCompatParcelizer) {
                    imageVector2.read++;
                }
                long j = i;
                if (j > requestfocusbypassunfocusablecomposeview.read) {
                    imageVector2.serializer++;
                }
                if (j > requestfocusbypassunfocusablecomposeview.IconCompatParcelizer) {
                    imageVector2.write++;
                }
            }
        }
    }

    public void read(Object obj) {
        int iIconCompatParcelizer = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer2 = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer3 = trackEventI.IconCompatParcelizer();
        long jLongValue = ((Long) UrlUtils.RemoteActionCompatParcelizer(iIconCompatParcelizer, trackEventI.IconCompatParcelizer(), iIconCompatParcelizer2, -1993279031, 1993279036, iIconCompatParcelizer3, new Object[0])).longValue();
        if (jLongValue == DragAndDropNodeKtfirstDescendantOrNull1.write) {
            this.IconCompatParcelizer = obj;
            return;
        }
        synchronized (this.read) {
            accessdispatchEntered accessdispatchentered = (accessdispatchEntered) ((AtomicReference) this.serializer).get();
            int iRemoteActionCompatParcelizer = accessdispatchentered.RemoteActionCompatParcelizer(jLongValue);
            if (iRemoteActionCompatParcelizer < 0) {
                ((AtomicReference) this.serializer).set(accessdispatchentered.RemoteActionCompatParcelizer(jLongValue, obj));
            } else {
                accessdispatchentered.serializer[iRemoteActionCompatParcelizer] = obj;
            }
        }
    }

    public EmojiProcessor(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation) {
        this.write = 14;
        this.serializer = getstyleable_vector_drawable_group_rotation;
        this.read = getDoubleOrNull.write(new onOptionsItemSelected(new CombinedScopeView(getstyleable_vector_drawable_group_rotation.setTitleMarginTop, getstyleable_vector_drawable_group_rotation.removeMenuProvider, getstyleable_vector_drawable_group_rotation.Contentfoundation, 3)));
        mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.setItemInvoker;
        mergeJsonObjects mergejsonobjects2 = getstyleable_vector_drawable_group_rotation.accessprocessDragStart;
        mergeJsonObjects mergejsonobjects3 = getstyleable_vector_drawable_group_rotation.ContentInViewNodelaunchAnimation21;
        setPresentationView setpresentationview = getstyleable_vector_drawable_group_rotation.createnHHXs2Y;
        this.IconCompatParcelizer = new isInBackStack(getstyleable_vector_drawable_group_rotation.setStacked, getstyleable_vector_drawable_group_rotation.setFilters, getstyleable_vector_drawable_group_rotation.setSupportButtonTintList, getstyleable_vector_drawable_group_rotation.setTextClassifier, getstyleable_vector_drawable_group_rotation.setImageBitmap, getstyleable_vector_drawable_group_rotation.getSupportImageTintList, getstyleable_vector_drawable_group_rotation.AndroidSelectionHandles_androidKt, new isMenuVisible(mergejsonobjects, mergejsonobjects2, mergejsonobjects3, setpresentationview, 0), getstyleable_vector_drawable_group_rotation.trimToSize, getstyleable_vector_drawable_group_rotation.FillElement, getstyleable_vector_drawable_group_rotation.TransformGestureDetectorKtdetectTransformGestures2, getstyleable_vector_drawable_group_rotation.getWithMapboxGeofencingConsent, getstyleable_vector_drawable_group_rotation.tryMinWidthJN0ABg, getstyleable_vector_drawable_group_rotation.Contentfoundation, mergejsonobjects3, new getSharedElementTargetNames(setpresentationview, 0));
    }

    public void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((TypedArray) this.read).recycle();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ((TypedArray) this.read).recycle();
        int i3 = RemoteActionCompatParcelizer + 125;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
    }

    public static EmojiProcessor RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        int i2 = 2 % 2;
        EmojiProcessor emojiProcessor = new EmojiProcessor(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        int i3 = MediaDescriptionCompat + 93;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 18 / 0;
        }
        return emojiProcessor;
    }

    public getFiveEK5gGoQ MediaDescriptionCompat() {
        int i = 2 % 2;
        Integer num = (Integer) this.serializer;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(num);
        Object obj = this.read;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(obj);
        getFiveEK5gGoQ getfiveek5ggoq = new getFiveEK5gGoQ(num, obj, (ArrayList) this.IconCompatParcelizer);
        int i2 = MediaDescriptionCompat + 55;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getfiveek5ggoq;
    }

    public File RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        File file = new File(((Context) this.serializer).getDir("google_tagmanager", 0), "resource_".concat(String.valueOf(str)));
        int i2 = RemoteActionCompatParcelizer + 109;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setRootFocusNodeui
    public boolean IconCompatParcelizer(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 == 0) {
            boolean z = obj instanceof accessgetDefaultJoincp;
            throw null;
        }
        if (obj instanceof accessgetDefaultJoincp) {
            int i4 = i3 + 109;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            ((accessgetDefaultJoincp) obj).n_().IconCompatParcelizer(true);
            int i6 = RemoteActionCompatParcelizer + 61;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        ((getJoinLxFBmk8) this.read).serializer(obj);
        return ((FocusOwnerImplfocusSearch1) this.IconCompatParcelizer).IconCompatParcelizer(obj);
    }

    public Drawable RemoteActionCompatParcelizer(int i) {
        int i2 = 2 % 2;
        TypedArray typedArray = (TypedArray) this.read;
        if (typedArray.hasValue(i)) {
            int i3 = RemoteActionCompatParcelizer + 97;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                int i5 = MediaDescriptionCompat + 17;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return IntPair.write((Context) this.serializer, resourceId);
                }
                int i6 = 83 / 0;
                return IntPair.write((Context) this.serializer, resourceId);
            }
        }
        return typedArray.getDrawable(i);
    }

    public static void serializer(EmojiProcessor emojiProcessor, String str) {
        nextFloat nextfloat;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            emojiProcessor.getClass();
            Object[] objArr = {((LinkedHashMap) emojiProcessor.serializer).remove(str), Boolean.TRUE};
            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
            throw null;
        }
        emojiProcessor.getClass();
        Object[] objArr2 = {((LinkedHashMap) emojiProcessor.serializer).remove(str), Boolean.TRUE};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            nextfloat = nextFloat.Recreation;
            int i3 = MediaDescriptionCompat + 57;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            nextfloat = nextFloat.Cold;
        }
        ((LinkedHashMap) emojiProcessor.read).put(str, nextfloat);
    }

    public ColorStateList serializer(int i) {
        int resourceId;
        int i2 = 2 % 2;
        TypedArray typedArray = (TypedArray) this.read;
        if (typedArray.hasValue(i)) {
            int i3 = RemoteActionCompatParcelizer + 87;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0 ? (resourceId = typedArray.getResourceId(i, 0)) != 0 : (resourceId = typedArray.getResourceId(i, 1)) != 0) {
                ColorStateList colorStateListWrite = FocusListener.write((Context) this.serializer, resourceId);
                if (colorStateListWrite != null) {
                    int i4 = RemoteActionCompatParcelizer + 57;
                    MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return colorStateListWrite;
                    }
                    throw null;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    public Object RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int iIconCompatParcelizer = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer2 = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer3 = trackEventI.IconCompatParcelizer();
        long jLongValue = ((Long) UrlUtils.RemoteActionCompatParcelizer(iIconCompatParcelizer, trackEventI.IconCompatParcelizer(), iIconCompatParcelizer2, -1993279031, 1993279036, iIconCompatParcelizer3, new Object[0])).longValue();
        if (jLongValue == DragAndDropNodeKtfirstDescendantOrNull1.write) {
            return this.IconCompatParcelizer;
        }
        accessdispatchEntered accessdispatchentered = (accessdispatchEntered) ((AtomicReference) this.serializer).get();
        int iRemoteActionCompatParcelizer = accessdispatchentered.RemoteActionCompatParcelizer(jLongValue);
        if (iRemoteActionCompatParcelizer < 0) {
            return null;
        }
        int i2 = MediaDescriptionCompat + 55;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = accessdispatchentered.serializer[iRemoteActionCompatParcelizer];
        int i4 = RemoteActionCompatParcelizer + 81;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return obj;
    }

    @Override // o.getSafeGestures
    public Object m_() {
        int i = 2 % 2;
        Object objM_ = ((getSafeGestures) this.serializer).m_();
        provideInsetsValuescytEWk0 provideinsetsvaluescytewk0 = new provideInsetsValuescytEWk0((getMaximumhdzbrEE) objM_, ((getFocusEK5gGoQ) ((MemoryCacheService) this.IconCompatParcelizer).RemoteActionCompatParcelizer).write);
        int i2 = MediaDescriptionCompat + 99;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return provideinsetsvaluescytewk0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void RemoteActionCompatParcelizer(getUseIntrinsicSize getuseintrinsicsize, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = getuseintrinsicsize.getFullyDrawnReporter;
        int i6 = getuseintrinsicsize.getDefaultViewModelCreationExtras;
        getuseintrinsicsize.getFullyDrawnReporter = 0;
        getuseintrinsicsize.getDefaultViewModelCreationExtras = 0;
        getuseintrinsicsize.MediaSessionCompatQueueItem(i2);
        getuseintrinsicsize.MediaMetadataCompat(i3);
        if (i5 < 0) {
            int i7 = RemoteActionCompatParcelizer + 3;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            getuseintrinsicsize.getFullyDrawnReporter = 0;
        } else {
            getuseintrinsicsize.getFullyDrawnReporter = i5;
            int i9 = RemoteActionCompatParcelizer + 83;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        if (i6 < 0) {
            int i11 = MediaDescriptionCompat + 5;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            getuseintrinsicsize.getDefaultViewModelCreationExtras = 0;
        } else {
            getuseintrinsicsize.getDefaultViewModelCreationExtras = i6;
        }
        getUseIntrinsicSize getuseintrinsicsize2 = (getUseIntrinsicSize) this.IconCompatParcelizer;
        getuseintrinsicsize2.MediaSessionCompatToken = i;
        getuseintrinsicsize2.IconCompatParcelizer();
    }

    public static final byte[] read(InputStream inputStream) {
        int i = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byte[] bArr = new byte[Fields.RotationZ];
                int i2 = RemoteActionCompatParcelizer + 67;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                while (true) {
                    int i4 = inputStream.read(bArr, 0, Fields.RotationZ);
                    if (i4 == -1) {
                        break;
                    }
                    int i5 = RemoteActionCompatParcelizer + 11;
                    MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    byteArrayOutputStream.write(bArr, 0, i4);
                }
            } catch (IOException unused) {
                getButtonThumbLeftEK5gGoQ.serializer("Failed to read the resource from disk");
            } finally {
                inputStream.close();
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused2) {
            getButtonThumbLeftEK5gGoQ.serializer("Error closing stream for reading resource from disk");
            return null;
        }
    }

    public SharedPreferences MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = ((Context) this.serializer).getSharedPreferences("v5_gtmContainerRefreshPolicy_".concat(String.valueOf((String) this.IconCompatParcelizer)), 0);
        int i4 = MediaDescriptionCompat + 101;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1 != 27) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return super.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r1 = o.sort.write((com.google.crypto.tink.proto.Keyset) r5.serializer).toString();
        r2 = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer + 13;
        androidx.emoji2.text.EmojiProcessor.MediaDescriptionCompat = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r0 = 28 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1 != 27) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.emoji2.text.EmojiProcessor.MediaDescriptionCompat
            int r1 = r1 + 45
            int r2 = r1 % 128
            androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 27
            r3 = 23
            if (r1 == 0) goto L1d
            int r1 = r5.write
            r4 = 94
            int r4 = r4 / 0
            if (r1 == r3) goto L44
            if (r1 == r2) goto L28
            goto L23
        L1d:
            int r1 = r5.write
            if (r1 == r3) goto L44
            if (r1 == r2) goto L28
        L23:
            java.lang.String r0 = super.toString()
            return r0
        L28:
            java.lang.Object r1 = r5.serializer
            com.google.crypto.tink.proto.Keyset r1 = (com.google.crypto.tink.proto.Keyset) r1
            com.google.crypto.tink.proto.KeysetInfo r1 = o.sort.write(r1)
            java.lang.String r1 = r1.toString()
            int r2 = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer
            int r2 = r2 + 13
            int r3 = r2 % 128
            androidx.emoji2.text.EmojiProcessor.MediaDescriptionCompat = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L43
            r0 = 28
            int r0 = r0 / 0
        L43:
            return r1
        L44:
            java.lang.Object r0 = r5.serializer
            java.util.List r0 = (java.util.List) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r5.read
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Rules: "
            java.lang.String r3 = "\n  Macros: "
            java.lang.String r0 = bo.app.af$$ExternalSyntheticOutline0.m(r2, r0, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.toString():java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    public void read(getUseIntrinsicSize getuseintrinsicsize) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ArrayList arrayList = (ArrayList) this.serializer;
        arrayList.clear();
        int size = getuseintrinsicsize.serializer.size();
        for (int i4 = 0; i4 < size; i4++) {
            setAlignment setalignment = (setAlignment) getuseintrinsicsize.serializer.get(i4);
            hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = setalignment.addOnNewIntentListener;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjkArr[0];
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
            if (hasspecifiedandfiniteheightuvyycjk != hasspecifiedandfiniteheightuvyycjk2) {
                int i5 = RemoteActionCompatParcelizer + 121;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (hasspecifiedandfiniteheightuvyycjkArr[1] == hasspecifiedandfiniteheightuvyycjk2) {
                    arrayList.add(setalignment);
                }
            } else {
                arrayList.add(setalignment);
            }
        }
        getuseintrinsicsize.write.serializer = true;
    }

    public long IconCompatParcelizer(long j, long j2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferencesMediaMetadataCompat = MediaMetadataCompat();
        long jMax = Math.max(0L, sharedPreferencesMediaMetadataCompat.getLong("FORBIDDEN_COUNT", 0L));
        long jNextFloat = (long) (((Random) this.read).nextFloat() * (j + ((long) ((jMax / ((jMax + Math.max(0L, sharedPreferencesMediaMetadataCompat.getLong("SUCCESSFUL_COUNT", 0L))) + 1)) * (j2 - j)))));
        int i4 = RemoteActionCompatParcelizer + 33;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return jNextFloat;
    }

    @Override // o.setRootFocusNodeui
    public Object write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((FocusOwnerImplfocusSearch1) this.IconCompatParcelizer).write();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objWrite = ((FocusOwnerImplfocusSearch1) this.IconCompatParcelizer).write();
        if (objWrite == null) {
            objWrite = ((StrokeCompanion) this.serializer).RemoteActionCompatParcelizer();
            if (Log.isLoggable("FactoryPools", 2)) {
                objWrite.getClass().toString();
            }
        }
        if (objWrite instanceof accessgetDefaultJoincp) {
            int i3 = MediaDescriptionCompat + 125;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            ((accessgetDefaultJoincp) objWrite).n_().IconCompatParcelizer(false);
        }
        return objWrite;
    }

    public Typeface read(int i, int i2, AppCompatTextHelper$1 appCompatTextHelper$1) {
        int i3 = 2 % 2;
        int resourceId = ((TypedArray) this.read).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.IconCompatParcelizer) == null) {
            this.IconCompatParcelizer = new TypedValue();
            int i4 = RemoteActionCompatParcelizer + 53;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        Context context = (Context) this.serializer;
        TypedValue typedValue = (TypedValue) this.IconCompatParcelizer;
        ThreadLocal threadLocal = setLeft.read;
        if (context.isRestricted()) {
            return null;
        }
        Typeface typefaceRemoteActionCompatParcelizer = setLeft.RemoteActionCompatParcelizer(context, resourceId, typedValue, i2, appCompatTextHelper$1, true, false);
        int i6 = MediaDescriptionCompat + 67;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return typefaceRemoteActionCompatParcelizer;
    }

    public void IconCompatParcelizer(String str) {
        boolean z;
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.IconCompatParcelizer;
        Object obj = linkedHashMap.get(str);
        Boolean bool = Boolean.TRUE;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, bool}, getCieXyz.write())).booleanValue()) {
            return;
        }
        nextFloat nextfloat = (nextFloat) ((LinkedHashMap) this.read).remove(str);
        if (nextfloat == null) {
            int i2 = RemoteActionCompatParcelizer + 61;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            nextfloat = nextFloat.Warm;
            int i4 = MediaDescriptionCompat + 109;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        nextfloat.getClass();
        ConcurrentHashMap concurrentHashMap = getInvalidateListenerui.write;
        if (nextfloat == nextFloat.Cold) {
            int i6 = MediaDescriptionCompat + 65;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        getInvalidateListenerui.RemoteActionCompatParcelizer(str, "isFirstLaunch", String.valueOf(z));
        getInvalidateListenerui.RemoteActionCompatParcelizer(str, "isRecreated", String.valueOf(nextfloat == nextFloat.Recreation));
        linkedHashMap.put(str, bool);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    public static boolean read(Editable editable, KeyEvent keyEvent, boolean z) {
        isValidimpl[] isvalidimplArr;
        int length;
        int i;
        int spanStart;
        int spanEnd;
        int i2 = 2 % 2;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1) {
                int i3 = MediaDescriptionCompat + 51;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 95 / 0;
                    if (selectionEnd != -1) {
                        if (selectionStart == selectionEnd && (isvalidimplArr = (isValidimpl[]) editable.getSpans(selectionStart, selectionEnd, isValidimpl.class)) != null && isvalidimplArr.length > 0) {
                            int i5 = MediaDescriptionCompat + 81;
                            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            length = isvalidimplArr.length;
                            i = 0;
                            while (i < length) {
                                isValidimpl isvalidimpl = isvalidimplArr[i];
                                spanStart = editable.getSpanStart(isvalidimpl);
                                spanEnd = editable.getSpanEnd(isvalidimpl);
                                if ((!z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                                    editable.delete(spanStart, spanEnd);
                                    return true;
                                }
                            }
                        }
                    }
                } else if (selectionEnd != -1) {
                    if (selectionStart == selectionEnd) {
                        int i7 = MediaDescriptionCompat + 81;
                        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        length = isvalidimplArr.length;
                        i = 0;
                        while (i < length) {
                            isValidimpl isvalidimpl2 = isvalidimplArr[i];
                            spanStart = editable.getSpanStart(isvalidimpl2);
                            spanEnd = editable.getSpanEnd(isvalidimpl2);
                            i = !z ? i + 1 : i + 1;
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    }
                }
            }
        }
        int i9 = RemoteActionCompatParcelizer + 37;
        MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public static final EmojiProcessor IconCompatParcelizer(removeNodesInRange removenodesinrange, minLookaheadIntrinsicHeight minlookaheadintrinsicheight) throws GeneralSecurityException, IOException {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) removenodesinrange.serializer;
        try {
            getOuterCoordinatorui getoutercoordinatoruiSerializer = getOuterCoordinatorui.serializer(byteArrayInputStream, getNotPlacedPlaceOrderuiannotations.read());
            byteArrayInputStream.close();
            if (getoutercoordinatoruiSerializer.IconCompatParcelizer().IconCompatParcelizer() == 0) {
                getAlignmentLinesMap.write("empty keyset");
                return null;
            }
            int i4 = RemoteActionCompatParcelizer + 113;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            try {
                Keyset keyset = Keyset.read(minlookaheadintrinsicheight.serializer(getoutercoordinatoruiSerializer.IconCompatParcelizer().read(), bArr), getNotPlacedPlaceOrderuiannotations.read());
                if (keyset.IconCompatParcelizer() <= 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                EmojiProcessor emojiProcessorIconCompatParcelizer = IconCompatParcelizer(keyset);
                int i6 = RemoteActionCompatParcelizer + 109;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return emojiProcessorIconCompatParcelizer;
            } catch (InvalidProtocolBufferException unused) {
                getAlignmentLinesMap.write("invalid keyset, corrupted key material");
                return null;
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public boolean write(CharSequence charSequence, int i, int i2, unaryMinusF1C5BW0 unaryminusf1c5bw0) {
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 125;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0 ? (unaryminusf1c5bw0.RemoteActionCompatParcelizer & 3) == 0 : (unaryminusf1c5bw0.RemoteActionCompatParcelizer & 4) == 0) {
            int i6 = MediaDescriptionCompat + 63;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            MutableRect3MmeM6k mutableRect3MmeM6k = (MutableRect3MmeM6k) this.IconCompatParcelizer;
            OffsetCompanion offsetCompanion = unaryminusf1c5bw0.read();
            int iRemoteActionCompatParcelizer = offsetCompanion.RemoteActionCompatParcelizer(8);
            if (iRemoteActionCompatParcelizer != 0) {
                int i8 = MediaDescriptionCompat + 7;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    offsetCompanion.write.getShort(iRemoteActionCompatParcelizer >>> offsetCompanion.read);
                } else {
                    offsetCompanion.write.getShort(iRemoteActionCompatParcelizer + offsetCompanion.read);
                }
            }
            mutableRect3MmeM6k.getClass();
            ThreadLocal threadLocal = MutableRect3MmeM6k.RemoteActionCompatParcelizer;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                int i9 = MediaDescriptionCompat + 63;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    sb.append(charSequence.charAt(i));
                    i += 70;
                } else {
                    sb.append(charSequence.charAt(i));
                    i++;
                }
            }
            boolean zRemoteActionCompatParcelizer = populateFocusOrder.RemoteActionCompatParcelizer(mutableRect3MmeM6k.write, sb.toString());
            int i10 = unaryminusf1c5bw0.RemoteActionCompatParcelizer & 4;
            if (zRemoteActionCompatParcelizer) {
                int i11 = RemoteActionCompatParcelizer + 59;
                MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = i10 | 2;
            } else {
                i3 = i10 | 1;
            }
            unaryminusf1c5bw0.RemoteActionCompatParcelizer = i3;
        }
        return (unaryminusf1c5bw0.RemoteActionCompatParcelizer & 3) == 2;
    }

    public /* synthetic */ EmojiProcessor(Object obj, Object obj2, Object obj3, int i) {
        this.write = i;
        this.serializer = obj;
        this.read = obj2;
        this.IconCompatParcelizer = obj3;
    }

    public EmojiProcessor(int i, Object obj) {
        this.write = 24;
        this.IconCompatParcelizer = new ArrayList();
        this.serializer = Integer.valueOf(i);
        this.read = obj;
    }

    public EmojiProcessor(Context context, String str) {
        this.write = 21;
        Random random = new Random();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        this.serializer = context;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        this.IconCompatParcelizer = str;
        this.read = random;
    }

    public EmojiProcessor(ArrayList arrayList, HashMap map, String str) {
        this.write = 23;
        this.serializer = Collections.unmodifiableList(arrayList);
        this.read = Collections.unmodifiableMap(map);
        this.IconCompatParcelizer = str;
    }

    public EmojiProcessor(BlurFilter blurFilter, updateMatrix updatematrix, DisplayMetrics displayMetrics) {
        this.write = 10;
        updatematrix.getClass();
        this.serializer = blurFilter;
        this.read = updatematrix;
        this.IconCompatParcelizer = displayMetrics;
    }

    public EmojiProcessor(requestFocusBypassUnfocusableComposeView requestfocusbypassunfocusablecomposeview) {
        this.write = 12;
        this.serializer = requestfocusbypassunfocusablecomposeview;
        this.read = new EmojiProcessor(11);
        this.IconCompatParcelizer = new EmojiProcessor(11);
    }

    public boolean IconCompatParcelizer(int i, setAlignment setalignment, rotate rotateVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = 2 % 2;
        RotateKt rotateKt = (RotateKt) this.read;
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = setalignment.addOnNewIntentListener;
        int[] iArr = setalignment.initializeViewTreeOwners;
        rotateKt.read = hasspecifiedandfiniteheightuvyycjkArr[0];
        rotateKt.MediaBrowserCompatMediaItem = hasspecifiedandfiniteheightuvyycjkArr[1];
        rotateKt.IconCompatParcelizer = setalignment.MediaSessionCompatQueueItem();
        rotateKt.MediaMetadataCompat = setalignment.MediaDescriptionCompat();
        rotateKt.MediaSessionCompatQueueItem = false;
        rotateKt.RemoteActionCompatParcelizer = i;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = rotateKt.read;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
        boolean z4 = hasspecifiedandfiniteheightuvyycjk == hasspecifiedandfiniteheightuvyycjk2;
        if (rotateKt.MediaBrowserCompatMediaItem == hasspecifiedandfiniteheightuvyycjk2) {
            int i3 = RemoteActionCompatParcelizer + 111;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!z4 || setalignment.createFullyDrawnExecutor <= 0.0f) {
            int i5 = RemoteActionCompatParcelizer + 57;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || setalignment.createFullyDrawnExecutor <= 0.0f) {
            z3 = false;
        } else {
            int i7 = RemoteActionCompatParcelizer + 83;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z3 = true;
        }
        if (z2) {
            int i9 = MediaDescriptionCompat + 15;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (iArr[0] == 4) {
                rotateKt.read = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
            }
        }
        if (z3) {
            int i11 = MediaDescriptionCompat + 79;
            int i12 = i11 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i12;
            int i13 = i11 % 2;
            if (iArr[1] == 4) {
                int i14 = i12 + 47;
                MediaDescriptionCompat = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                rotateKt.MediaBrowserCompatMediaItem = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
            }
        }
        rotateVar.measure(setalignment, rotateKt);
        setalignment.MediaSessionCompatQueueItem(rotateKt.RatingCompat);
        setalignment.MediaMetadataCompat(rotateKt.MediaDescriptionCompat);
        setalignment.addObserverForBackInvokerlambda0 = rotateKt.write;
        setalignment.RatingCompat(rotateKt.serializer);
        rotateKt.RemoteActionCompatParcelizer = 0;
        return rotateKt.MediaSessionCompatQueueItem;
    }

    public EmojiProcessor(Application application) {
        this.write = 15;
        this.serializer = application;
        this.read = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(7, this));
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new StateV3$$ExternalSyntheticLambda0(3));
    }

    public EmojiProcessor(getContentViewGroupParentLayout getcontentviewgroupparentlayout, AppEventInfoChangeHandler appEventInfoChangeHandler, SaveHeatmapUrlImpl saveHeatmapUrlImpl) {
        this.write = 16;
        getcontentviewgroupparentlayout.getClass();
        appEventInfoChangeHandler.getClass();
        this.serializer = getcontentviewgroupparentlayout;
        this.read = appEventInfoChangeHandler;
        this.IconCompatParcelizer = saveHeatmapUrlImpl;
    }

    public EmojiProcessor(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.write = 13;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(UrlUtils.serializer());
        this.IconCompatParcelizer = SQLite.IconCompatParcelizer(Integer.MAX_VALUE, 6, (IInAppMessageViewWrapper) null);
        BuildersKt.RemoteActionCompatParcelizer(contextScopeRemoteActionCompatParcelizer, null, null, new SerialCoroutineWorker$2(this, null), 3);
    }

    public EmojiProcessor(sendContentCaptureTextUpdateEvent sendcontentcapturetextupdateevent) {
        this.write = 2;
        this.serializer = new DragAndDropNodeacceptDragAndDropTransfer1(0);
        this.read = new ComponentRegistry$Builder();
        this.IconCompatParcelizer = new d4$$ExternalSyntheticLambda2(this, 4, sendcontentcapturetextupdateevent);
    }

    public EmojiProcessor(int i) {
        this.write = i;
        if (i == 9) {
            this.serializer = new LinkedHashMap();
            this.read = new LinkedHashMap();
            this.IconCompatParcelizer = new LinkedHashMap();
        } else if (i != 11) {
            this.serializer = new AtomicReference(containsUv8p0NA.serializer);
            this.read = new Object();
        } else {
            this.serializer = new Object();
            this.read = new LinkedHashMap();
            this.IconCompatParcelizer = new LinkedHashSet();
        }
    }

    public EmojiProcessor(Context context, TypedArray typedArray) {
        this.write = 1;
        this.serializer = context;
        this.read = typedArray;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public Object reportImageLoadingTimeTrace(String str, ContinuationImpl continuationImpl) {
        markTintForColor8_81llA marktintforcolor8_81lla;
        EmojiProcessor emojiProcessor;
        int i = 2 % 2;
        if (continuationImpl instanceof markTintForColor8_81llA) {
            marktintforcolor8_81lla = (markTintForColor8_81llA) continuationImpl;
            int i2 = marktintforcolor8_81lla.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaDescriptionCompat + 101;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                marktintforcolor8_81lla.write = i3 % 2 != 0 ? i2 * Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                marktintforcolor8_81lla = new markTintForColor8_81llA(this, continuationImpl);
            }
        } else {
            marktintforcolor8_81lla = new markTintForColor8_81llA(this, continuationImpl);
        }
        Object objIconCompatParcelizer = marktintforcolor8_81lla.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = marktintforcolor8_81lla.write;
        if (i4 != 0) {
            int i5 = RemoteActionCompatParcelizer;
            int i6 = i5 + 19;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = i5 + 41;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            str = marktintforcolor8_81lla.RemoteActionCompatParcelizer;
            emojiProcessor = marktintforcolor8_81lla.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            updateMatrix updatematrix = (updateMatrix) this.read;
            marktintforcolor8_81lla.serializer = this;
            marktintforcolor8_81lla.RemoteActionCompatParcelizer = str;
            marktintforcolor8_81lla.write = 1;
            objIconCompatParcelizer = updatematrix.IconCompatParcelizer(str, marktintforcolor8_81lla);
            if (objIconCompatParcelizer == coroutineSingletons) {
                return coroutineSingletons;
            }
            emojiProcessor = this;
        }
        parseFourDigits parsefourdigits = (parseFourDigits) objIconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (parsefourdigits == null) {
            return createfromparcel;
        }
        emojiProcessor.getClass();
        BlurFilter blurFilter = (BlurFilter) emojiProcessor.serializer;
        String str2 = "rclt_" + str;
        blurFilter.serializer(str2);
        blurFilter.RemoteActionCompatParcelizer(str2, "screen_density", String.valueOf(((DisplayMetrics) emojiProcessor.IconCompatParcelizer).densityDpi));
        long j = parsefourdigits.read();
        AndroidShadowContext_androidKt androidShadowContext_androidKt = AndroidShadowContext_androidKt.PERCENTILE;
        blurFilter.write(str2, "p50", j, androidShadowContext_androidKt);
        blurFilter.write(str2, "p75", parsefourdigits.IconCompatParcelizer(), androidShadowContext_androidKt);
        blurFilter.write(str2, "p95", parsefourdigits.RemoteActionCompatParcelizer(), androidShadowContext_androidKt);
        blurFilter.write(str2, "max", parsefourdigits.serializer(), androidShadowContext_androidKt);
        blurFilter.write(str2);
        return createfromparcel;
    }

    public EmojiProcessor(getUseIntrinsicSize getuseintrinsicsize) {
        this.write = 5;
        this.serializer = new ArrayList();
        this.read = new RotateKt();
        this.IconCompatParcelizer = getuseintrinsicsize;
    }

    public static final EmojiProcessor IconCompatParcelizer(Keyset keyset) throws GeneralSecurityException {
        Integer numValueOf;
        int i = 2 % 2;
        Object obj = null;
        if (keyset.IconCompatParcelizer() <= 0) {
            getAlignmentLinesMap.write("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(keyset.IconCompatParcelizer());
        Iterator it = keyset.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            int i2 = RemoteActionCompatParcelizer + 29;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                Keyset.Key key = (Keyset.Key) it.next();
                key.getClass();
                key.serializer();
                key.MediaMetadataCompat();
                requestRemeasureui requestremeasureui = requestRemeasureui.RAW;
                obj.hashCode();
                throw null;
            }
            Keyset.Key key2 = (Keyset.Key) it.next();
            key2.getClass();
            int iSerializer = key2.serializer();
            if (key2.MediaMetadataCompat() == requestRemeasureui.RAW) {
                int i3 = MediaDescriptionCompat + 81;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(iSerializer);
            }
            try {
                try {
                    removeNodeAtDepth removenodeatdepthRemoteActionCompatParcelizer = setLayoutModifierNodeui.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(MetricsBatchProcessor.IconCompatParcelizer(key2.RemoteActionCompatParcelizer().RatingCompat(), key2.RemoteActionCompatParcelizer().MediaMetadataCompat(), key2.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(), key2.MediaMetadataCompat(), numValueOf));
                    int i5 = hasHit.serializer[key2.MediaDescriptionCompat().ordinal()];
                    if (i5 != 1 && i5 != 2 && i5 != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new hitExpandedTouchBounds(removenodeatdepthRemoteActionCompatParcelizer));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a protokey serialization failed", e);
            }
        }
        return new EmojiProcessor(keyset, Collections.unmodifiableList(arrayList));
    }

    public EmojiProcessor(ImageLoader$Builder imageLoader$Builder, zzj zzjVar, MutableRect3MmeM6k mutableRect3MmeM6k, Set set) {
        this.write = 0;
        this.serializer = zzjVar;
        this.read = imageLoader$Builder;
        this.IconCompatParcelizer = mutableRect3MmeM6k;
        int i = 2;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            int i2 = RemoteActionCompatParcelizer + 37;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                write(str, 0, str.length(), 1, true, new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(str, i));
            }
        }
        int i4 = RemoteActionCompatParcelizer + 7;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public EmojiProcessor(FocusOwnerImplfocusSearch1 focusOwnerImplfocusSearch1, StrokeCompanion strokeCompanion, getJoinLxFBmk8 getjoinlxfbmk8) {
        this.write = 8;
        this.IconCompatParcelizer = focusOwnerImplfocusSearch1;
        this.serializer = strokeCompanion;
        this.read = getjoinlxfbmk8;
    }

    public EmojiProcessor(Context context, int i) {
        this.write = i;
        if (i != 22) {
            context.getApplicationContext();
            this.serializer = "_androidx_security_master_key_";
            return;
        }
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryDefaultThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        getFocusEK5gGoQ getfocusek5ggoq = new getFocusEK5gGoQ(context, 0);
        this.serializer = context;
        this.read = executorServiceUnconfigurableExecutorService;
        this.IconCompatParcelizer = getfocusek5ggoq;
    }

    public EmojiProcessor(ConcurrentMap concurrentMap, listIterator listiterator, getZSortedChildrenannotations getzsortedchildrenannotations, Class cls) {
        this.write = 28;
        this.serializer = concurrentMap;
        this.read = listiterator;
        this.IconCompatParcelizer = getzsortedchildrenannotations;
    }

    public EmojiProcessor(Keyset keyset, List list) {
        this.write = 27;
        this.serializer = keyset;
        this.read = list;
        this.IconCompatParcelizer = getZSortedChildrenannotations.read;
    }

    public /* synthetic */ EmojiProcessor(int i, boolean z) {
        this.write = i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x010e A[SYNTHETIC] */
    public Object write(CharSequence charSequence, int i, int i2, int i3, boolean z, getDistanceimpl getdistanceimpl) {
        int iCharCount;
        SparseArray sparseArray;
        plusMKHz9U plusmkhz9u;
        plusMKHz9U plusmkhz9u2;
        int i4;
        char c;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        divtuRUvjQ divturuvjq = new divtuRUvjQ((plusMKHz9U) ((ImageLoader$Builder) this.read).read);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i9 = MediaDescriptionCompat + 57;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        int i11 = 0;
        int iCodePointAt2 = iCodePointAt;
        int i12 = 0;
        boolean zRemoteActionCompatParcelizer = true;
        int iCharCount2 = i;
        loop0: while (true) {
            int iCodePointAt3 = iCodePointAt2;
            iCharCount = iCharCount2;
            while (true) {
                if (iCharCount < i2 && i12 < i3) {
                    int i13 = MediaDescriptionCompat + 125;
                    RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        if (!zRemoteActionCompatParcelizer) {
                            break loop0;
                        }
                        sparseArray = divturuvjq.write.RemoteActionCompatParcelizer;
                        if (sparseArray == null) {
                            plusmkhz9u = null;
                        } else {
                            plusmkhz9u = (plusMKHz9U) sparseArray.get(iCodePointAt3);
                            int i14 = MediaDescriptionCompat + 23;
                            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                        }
                        if (divturuvjq.RatingCompat != 2) {
                            i7 = MediaDescriptionCompat + 51;
                            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                            if (i7 % 2 == 0) {
                                throw null;
                            }
                            if (plusmkhz9u == null) {
                                divturuvjq.write();
                                c = 1;
                            } else {
                                divturuvjq.RatingCompat = 2;
                                divturuvjq.write = plusmkhz9u;
                                divturuvjq.read = 1;
                                c = 2;
                            }
                        } else {
                            if (plusmkhz9u != null) {
                                i5 = RemoteActionCompatParcelizer + 113;
                                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                                if (i5 % 2 == 0) {
                                    divturuvjq.write = plusmkhz9u;
                                    i6 = divturuvjq.read;
                                } else {
                                    divturuvjq.write = plusmkhz9u;
                                    i6 = divturuvjq.read + 1;
                                }
                                divturuvjq.read = i6;
                            } else {
                                if (iCodePointAt3 == 65038) {
                                    divturuvjq.write();
                                } else if (iCodePointAt3 == 65039) {
                                    plusmkhz9u2 = divturuvjq.write;
                                    if (plusmkhz9u2.write != null) {
                                        i4 = MediaDescriptionCompat + 103;
                                        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                                        if (i4 % 2 != 0) {
                                            divturuvjq.serializer = plusmkhz9u2;
                                            divturuvjq.write();
                                            c = 3;
                                        } else {
                                            divturuvjq.serializer = plusmkhz9u2;
                                            divturuvjq.write();
                                            c = 3;
                                        }
                                    } else {
                                        divturuvjq.write();
                                    }
                                }
                                c = 1;
                            }
                            c = 2;
                        }
                        divturuvjq.IconCompatParcelizer = iCodePointAt3;
                        if (c != 1) {
                            iCharCount2 += Character.charCount(Character.codePointAt(charSequence, iCharCount2));
                            if (iCharCount2 < i2) {
                                iCodePointAt2 = Character.codePointAt(charSequence, iCharCount2);
                                break;
                                break;
                            }
                        } else {
                            if (c != 2) {
                                iCharCount += Character.charCount(iCodePointAt3);
                                if (iCharCount < i2) {
                                    iCodePointAt3 = Character.codePointAt(charSequence, iCharCount);
                                }
                            } else if (c != 3) {
                                if (z) {
                                    zRemoteActionCompatParcelizer = getdistanceimpl.RemoteActionCompatParcelizer(charSequence, iCharCount2, iCharCount, divturuvjq.serializer.write);
                                    i12++;
                                } else {
                                    zRemoteActionCompatParcelizer = getdistanceimpl.RemoteActionCompatParcelizer(charSequence, iCharCount2, iCharCount, divturuvjq.serializer.write);
                                    i12++;
                                }
                                iCharCount2 = iCharCount;
                            }
                            i11 = 0;
                        }
                        iCodePointAt2 = iCodePointAt3;
                        break;
                        break;
                    }
                    int i16 = 50 / i11;
                    if (!zRemoteActionCompatParcelizer) {
                        break loop0;
                    }
                    sparseArray = divturuvjq.write.RemoteActionCompatParcelizer;
                    if (sparseArray == null) {
                        plusmkhz9u = null;
                    } else {
                        plusmkhz9u = (plusMKHz9U) sparseArray.get(iCodePointAt3);
                        int i17 = MediaDescriptionCompat + 23;
                        RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                    }
                    if (divturuvjq.RatingCompat != 2) {
                        i7 = MediaDescriptionCompat + 51;
                        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            throw null;
                        }
                        if (plusmkhz9u == null) {
                            divturuvjq.write();
                            c = 1;
                        } else {
                            divturuvjq.RatingCompat = 2;
                            divturuvjq.write = plusmkhz9u;
                            divturuvjq.read = 1;
                            c = 2;
                        }
                    } else {
                        if (plusmkhz9u != null) {
                            i5 = RemoteActionCompatParcelizer + 113;
                            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                            if (i5 % 2 == 0) {
                                divturuvjq.write = plusmkhz9u;
                                i6 = divturuvjq.read;
                            } else {
                                divturuvjq.write = plusmkhz9u;
                                i6 = divturuvjq.read + 1;
                            }
                            divturuvjq.read = i6;
                        } else {
                            if (iCodePointAt3 == 65038) {
                                divturuvjq.write();
                            } else if (iCodePointAt3 == 65039) {
                                plusmkhz9u2 = divturuvjq.write;
                                if (plusmkhz9u2.write != null) {
                                    i4 = MediaDescriptionCompat + 103;
                                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                                    if (i4 % 2 != 0 ? divturuvjq.read != 1 : divturuvjq.read != 0) {
                                        divturuvjq.serializer = plusmkhz9u2;
                                        divturuvjq.write();
                                    } else if (divturuvjq.IconCompatParcelizer()) {
                                        divturuvjq.serializer = divturuvjq.write;
                                        divturuvjq.write();
                                    } else {
                                        divturuvjq.write();
                                    }
                                    c = 3;
                                } else {
                                    divturuvjq.write();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    }
                    divturuvjq.IconCompatParcelizer = iCodePointAt3;
                    if (c != 1) {
                        iCharCount2 += Character.charCount(Character.codePointAt(charSequence, iCharCount2));
                        if (iCharCount2 < i2) {
                            iCodePointAt2 = Character.codePointAt(charSequence, iCharCount2);
                            break;
                        }
                    } else {
                        if (c != 2) {
                            iCharCount += Character.charCount(iCodePointAt3);
                            if (iCharCount < i2) {
                                iCodePointAt3 = Character.codePointAt(charSequence, iCharCount);
                            }
                        } else if (c != 3) {
                            if (z || !write(charSequence, iCharCount2, iCharCount, divturuvjq.serializer.write)) {
                                zRemoteActionCompatParcelizer = getdistanceimpl.RemoteActionCompatParcelizer(charSequence, iCharCount2, iCharCount, divturuvjq.serializer.write);
                                i12++;
                            }
                            iCharCount2 = iCharCount;
                        }
                        i11 = 0;
                    }
                    iCodePointAt2 = iCodePointAt3;
                    break;
                }
                break loop0;
            }
            i11 = 0;
        }
        if (divturuvjq.RatingCompat == 2 && divturuvjq.write.write != null && ((divturuvjq.read > 1 || divturuvjq.IconCompatParcelizer()) && i12 < i3 && zRemoteActionCompatParcelizer)) {
            int i19 = RemoteActionCompatParcelizer + 121;
            MediaDescriptionCompat = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            if (z || !write(charSequence, iCharCount2, iCharCount, divturuvjq.write.write)) {
                getdistanceimpl.RemoteActionCompatParcelizer(charSequence, iCharCount2, iCharCount, divturuvjq.write.write);
            }
        }
        return getdistanceimpl.write();
    }

    public onAfterPlaceAt serializer() throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 41;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        DistanceAndFlagsdefault distanceAndFlagsdefault = (DistanceAndFlagsdefault) this.serializer;
        if (distanceAndFlagsdefault != null) {
            int i4 = i2 + 99;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Extras$Key extras$Key = (Extras$Key) this.read;
            if (extras$Key != null) {
                int i6 = i2 + 41;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (distanceAndFlagsdefault.IconCompatParcelizer != ((setNextChildPlaceOrderui) extras$Key.IconCompatParcelizer).RemoteActionCompatParcelizer.length) {
                    getAlignmentLinesMap.write("Key size mismatch");
                    return null;
                }
                accessDistanceAndFlags accessdistanceandflags = distanceAndFlagsdefault.write;
                accessDistanceAndFlags accessdistanceandflags2 = accessDistanceAndFlags.RemoteActionCompatParcelizer;
                if (accessdistanceandflags != accessdistanceandflags2) {
                    if (((Integer) this.IconCompatParcelizer) == null) {
                        getAlignmentLinesMap.write("Cannot create key without ID requirement with parameters with ID requirement");
                        return null;
                    }
                    int i8 = RemoteActionCompatParcelizer + 47;
                    MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        int i9 = 5 % 3;
                    }
                }
                if (accessdistanceandflags == accessdistanceandflags2 && ((Integer) this.IconCompatParcelizer) != null) {
                    getAlignmentLinesMap.write("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                if (accessdistanceandflags == accessdistanceandflags2) {
                    int i10 = MediaDescriptionCompat + 85;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        setNextChildPlaceOrderui.IconCompatParcelizer(new byte[1]);
                    } else {
                        setNextChildPlaceOrderui.IconCompatParcelizer(new byte[0]);
                    }
                } else if (accessdistanceandflags == accessDistanceAndFlags.IconCompatParcelizer) {
                    int i11 = RemoteActionCompatParcelizer + 5;
                    MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        setNextChildPlaceOrderui.IconCompatParcelizer(ByteBuffer.allocate(3).put((byte) 1).putInt(((Integer) this.IconCompatParcelizer).intValue()).array());
                    } else {
                        setNextChildPlaceOrderui.IconCompatParcelizer(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.IconCompatParcelizer).intValue()).array());
                    }
                } else {
                    if (accessdistanceandflags != accessDistanceAndFlags.read) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(((DistanceAndFlagsdefault) this.serializer).write, "Unknown AesGcmParameters.Variant: ");
                        return null;
                    }
                    setNextChildPlaceOrderui.IconCompatParcelizer(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.IconCompatParcelizer).intValue()).array());
                }
                return new onAfterPlaceAt();
            }
        }
        getAlignmentLinesMap.write("Cannot build without parameters and/or key material");
        return null;
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        HomeFragment homeFragment = (HomeFragment) obj;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.serializer;
        homeFragment.initializeViewTreeOwners = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
        homeFragment.IconCompatParcelizer = (onOptionsItemSelected) ((getDoubleOrNull) this.read).write;
        homeFragment.MediaSessionCompatToken = new AndroidUiDispatcherCompanioncurrentThread1(16);
        homeFragment.getNavigationEventDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((isInBackStack) this.IconCompatParcelizer);
        homeFragment.RatingCompat = new onHiddenChanged(getstyleable_vector_drawable_group_rotation.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, getColorIntegerOrNull.serializer((mergeJsonObjects) getstyleable_vector_drawable_group_rotation.onUserLeaveHint));
        homeFragment.MediaBrowserCompatMediaItem = new setDrawDisappearingViewsLast(getColorIntegerOrNull.serializer((mergeJsonObjects) getstyleable_vector_drawable_group_rotation.getInflatedId));
        int i2 = 4;
        int i3 = 6;
        homeFragment.PlaybackStateCompat = new markItemDecorInsetsDirty(new accessstripNonMetricAffectingCharacterStyleSpans(new isMainThread(i2), new accessisMainThread(), new MediaBrowserCompatMediaItem(i3)));
        copyRetOiIg copyretoiig = new copyRetOiIg();
        TextGranularity textGranularity = new TextGranularity();
        TextGranularity textGranularity2 = new TextGranularity();
        getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new MediaBrowserCompatMediaItem(7);
        fastMapTo fastmapto = (fastMapTo) getstyleable_vector_drawable_group_rotation.getSupportCheckMarkTintList.write;
        accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans = new accessstripNonMetricAffectingCharacterStyleSpans(new isMainThread(i2), new accessisMainThread(), new MediaBrowserCompatMediaItem(i3));
        createGraphemeClusterSegmentFinder creategraphemeclustersegmentfinder = (createGraphemeClusterSegmentFinder) getstyleable_vector_drawable_group_rotation.accesswaitForCompositionAfterTargetStateChange.write();
        fastmapto.getClass();
        creategraphemeclustersegmentfinder.getClass();
        ProtobufEncoder protobufEncoder = new ProtobufEncoder();
        protobufEncoder.write = fastmapto;
        protobufEncoder.serializer = accessstripnonmetricaffectingcharacterstylespans;
        protobufEncoder.RemoteActionCompatParcelizer = creategraphemeclustersegmentfinder;
        Path$Companion path$Companion = new Path$Companion();
        AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1 = new AndroidUiDispatcherCompanioncurrentThread1(5);
        BrazeExternalSyntheticLambda45 brazeExternalSyntheticLambda45 = (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), -525972792, n5.IconCompatParcelizer(), n5.IconCompatParcelizer(), n5.IconCompatParcelizer());
        new p0();
        CreateHomeScope createHomeScope = new CreateHomeScope();
        createHomeScope.read = brazeExternalSyntheticLambda45;
        homeFragment.MediaDescriptionCompat = new getChildViewHolderInt(copyretoiig, textGranularity, textGranularity2, getactionviewintentlambda0, mediaBrowserCompatMediaItem, protobufEncoder, path$Companion, androidUiDispatcherCompanioncurrentThread1, createHomeScope, (getContentViewGroupParentLayout) getstyleable_vector_drawable_group_rotation.ContentInViewNodelaunchAnimation21.write());
        homeFragment.MediaMetadataCompat = new WrongNestedHierarchyViolation();
        homeFragment.read = new FragmentSavedState(new setSharedElementEnterTransition(new setPopDirection(accessgetLookaheadAndAncestorMeasureSetp.RemoteActionCompatParcelizer(3, new Object[]{"EarningsExtraLargeBubbleContentKey", new accessgetCharactercp(), "defaultLargeBubbleContentKey", new setSharedElementReturnTransition(0), "defaultExtraLargeBubbleContentKey", new setSharedElementReturnTransition(1)}, null))));
        homeFragment.MediaSessionCompatQueueItem = new setLineBreakConfig(new fillStringBounds(), new fillStringBounds());
        homeFragment.MediaSessionCompatResultReceiverWrapper = new copyO0kMr_c((transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write(), (getSoftWrap) getstyleable_vector_drawable_group_rotation.getActivityResultRegistry.write());
        homeFragment.ResultReceiver = getstyleable_vector_drawable_group_rotation.getLifecycle();
        homeFragment.ParcelableVolumeInfo = getstyleable_vector_drawable_group_rotation.getDefaultViewModelProviderFactory();
        homeFragment.write = (snapToTargetExistingView) getstyleable_vector_drawable_group_rotation.getLifecycleRegistry1.write();
        int i4 = RemoteActionCompatParcelizer + 57;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void IconCompatParcelizer(accessgetEightcp accessgeteightcp, int i, boolean z) {
        Long lValueOf;
        int i2 = 2 % 2;
        accessgetJcp accessgetjcp = (accessgetJcp) this.IconCompatParcelizer;
        Context context = (Context) this.serializer;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(accessgeteightcp.serializer.getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(ByteBuffer.allocate(4).putInt(accessgetMediaPlayPausecp.serializer(accessgeteightcp.IconCompatParcelizer)).array());
        byte[] bArr = accessgeteightcp.read;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i3 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i3 < i) {
                        break;
                    }
                    RangesKt.serializer(accessgeteightcp, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = ((SQLiteEventStore) this.read).IconCompatParcelizer();
        String str = accessgeteightcp.serializer;
        accessgetBrowsercp accessgetbrowsercp = accessgeteightcp.IconCompatParcelizer;
        Cursor cursorRawQuery = sQLiteDatabaseIconCompatParcelizer.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(accessgetMediaPlayPausecp.serializer(accessgetbrowsercp))});
        try {
            if (cursorRawQuery.moveToNext()) {
                int i4 = MediaDescriptionCompat + 3;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                lValueOf = Long.valueOf(cursorRawQuery.getLong(0));
            } else {
                lValueOf = 0L;
            }
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(accessgetjcp.read(accessgetbrowsercp, jLongValue, i));
            Set set = ((accessgetKanacp) accessgetjcp.RemoteActionCompatParcelizer.get(accessgetbrowsercp)).write;
            if (!set.contains(accessgetInsertcp.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(1);
            } else {
                builder.setRequiredNetworkType(2);
            }
            if (!(!set.contains(accessgetInsertcp.DEVICE_CHARGING))) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(accessgetInsertcp.DEVICE_IDLE)) {
                int i6 = RemoteActionCompatParcelizer + 63;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(RemoteMessageConst.Notification.PRIORITY, accessgetMediaPlayPausecp.serializer(accessgetbrowsercp));
            byte[] bArr2 = accessgeteightcp.read;
            if (bArr2 != null) {
                persistableBundle.putString(InAppMessageBase.EXTRAS, Base64.encodeToString(bArr2, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {accessgeteightcp, Integer.valueOf(value), Long.valueOf(accessgetjcp.read(accessgetbrowsercp, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
                int i8 = MediaDescriptionCompat + 99;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 5 / 5;
                }
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x021c A[PHI: r0
  0x021c: PHI (r0v30 o.removeLast) = (r0v29 o.removeLast), (r0v34 o.removeLast) binds: [B:90:0x021a, B:87:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0226  */
    public Object serializer(Class cls) throws GeneralSecurityException {
        Class clsSerializer;
        removeLast removelast;
        Object objWrite;
        Object objWrite2;
        int i = 2 % 2;
        AtomicReference atomicReference = removeFirst.write;
        Object obj = null;
        try {
            HashMap map = ((LayoutModifierNodeKt) getWrappedNonNull.serializer.IconCompatParcelizer.get()).write;
            if (!map.containsKey(cls)) {
                throw new GeneralSecurityException(d$$ExternalSyntheticOutline0.m(cls, "No input primitive class for ", " available"));
            }
            int i2 = RemoteActionCompatParcelizer + 59;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            clsSerializer = ((removeLast) map.get(cls)).serializer();
            if (clsSerializer == null) {
                throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
            }
            int i4 = RemoteActionCompatParcelizer + 77;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            List list = (List) this.read;
            Keyset keyset = (Keyset) this.serializer;
            int i6 = sort.IconCompatParcelizer;
            int iSerializer = keyset.serializer();
            int i7 = MediaDescriptionCompat + 49;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = 0;
            boolean z = false;
            boolean z2 = true;
            for (Keyset.Key key : keyset.RemoteActionCompatParcelizer()) {
                if (key.MediaDescriptionCompat() == isSemanticsInvalidatedui.ENABLED) {
                    if (!key.MediaSessionCompatQueueItem()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(key.serializer())));
                    }
                    if (key.MediaMetadataCompat() == requestRemeasureui.UNKNOWN_PREFIX) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(key.serializer())));
                    }
                    int i10 = MediaDescriptionCompat + 95;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        key.MediaDescriptionCompat();
                        isSemanticsInvalidatedui issemanticsinvalidatedui = isSemanticsInvalidatedui.UNKNOWN_STATUS;
                        obj.hashCode();
                        throw null;
                    }
                    if (key.MediaDescriptionCompat() == isSemanticsInvalidatedui.UNKNOWN_STATUS) {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(key.serializer())));
                    }
                    if (key.serializer() == iSerializer) {
                        if (z) {
                            getAlignmentLinesMap.write("keyset contains multiple primary keys");
                            return null;
                        }
                        z = true;
                    }
                    if (key.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer() != invalidateSemanticsui.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                    i9++;
                }
            }
            if (i9 == 0) {
                getAlignmentLinesMap.write("keyset must contain at least one ENABLED key");
                return null;
            }
            if (!z) {
                int i11 = MediaDescriptionCompat + 89;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (!z2) {
                    getAlignmentLinesMap.write("keyset doesn't contain a valid primary key");
                    return null;
                }
            }
            ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder();
            imageLoader$Builder.IconCompatParcelizer = new ConcurrentHashMap();
            imageLoader$Builder.RemoteActionCompatParcelizer = clsSerializer;
            imageLoader$Builder.serializer = getZSortedChildrenannotations.read;
            getZSortedChildrenannotations getzsortedchildrenannotations = (getZSortedChildrenannotations) this.IconCompatParcelizer;
            if (((ConcurrentHashMap) imageLoader$Builder.IconCompatParcelizer) == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("setAnnotations cannot be called after build");
                return null;
            }
            imageLoader$Builder.serializer = getzsortedchildrenannotations;
            for (int i13 = 0; i13 < keyset.IconCompatParcelizer(); i13++) {
                Keyset.Key keyIconCompatParcelizer = keyset.IconCompatParcelizer(i13);
                if (keyIconCompatParcelizer.MediaDescriptionCompat().equals(isSemanticsInvalidatedui.ENABLED)) {
                    try {
                        KeyData keyDataRemoteActionCompatParcelizer = keyIconCompatParcelizer.RemoteActionCompatParcelizer();
                        AtomicReference atomicReference2 = removeFirst.write;
                        objWrite = removeFirst.write(keyDataRemoteActionCompatParcelizer.RatingCompat(), keyDataRemoteActionCompatParcelizer.MediaMetadataCompat(), clsSerializer);
                    } catch (GeneralSecurityException e) {
                        if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
                            throw e;
                        }
                        objWrite = null;
                    }
                    if (list.get(i13) != null) {
                        try {
                            objWrite2 = removeFirst.write(((hitExpandedTouchBounds) list.get(i13)).serializer, clsSerializer);
                        } catch (GeneralSecurityException unused) {
                            objWrite2 = null;
                        }
                    } else {
                        objWrite2 = null;
                    }
                    if (keyIconCompatParcelizer.serializer() == keyset.serializer()) {
                        imageLoader$Builder.IconCompatParcelizer(objWrite2, objWrite, keyIconCompatParcelizer, true);
                    } else {
                        imageLoader$Builder.IconCompatParcelizer(objWrite2, objWrite, keyIconCompatParcelizer, false);
                    }
                }
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) imageLoader$Builder.IconCompatParcelizer;
            if (concurrentHashMap == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("build cannot be called twice");
                return null;
            }
            listIterator listiterator = (listIterator) imageLoader$Builder.read;
            getZSortedChildrenannotations getzsortedchildrenannotations2 = (getZSortedChildrenannotations) imageLoader$Builder.serializer;
            Class cls2 = (Class) imageLoader$Builder.RemoteActionCompatParcelizer;
            EmojiProcessor emojiProcessor = new EmojiProcessor(concurrentHashMap, listiterator, getzsortedchildrenannotations2, cls2);
            imageLoader$Builder.IconCompatParcelizer = null;
            AtomicReference atomicReference3 = removeFirst.write;
            HashMap map2 = ((LayoutModifierNodeKt) getWrappedNonNull.serializer.IconCompatParcelizer.get()).write;
            if (!map2.containsKey(cls)) {
                throw new GeneralSecurityException(c8$$ExternalSyntheticOutline0.m(cls, "No wrapper found for "));
            }
            int i14 = MediaDescriptionCompat + 107;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                removelast = (removeLast) map2.get(cls);
                int i15 = 26 / 0;
                if (cls2.equals(removelast.serializer())) {
                    if (removelast.serializer().equals(cls2)) {
                        return removelast.RemoteActionCompatParcelizer(emojiProcessor);
                    }
                }
            } else {
                removelast = (removeLast) map2.get(cls);
                if (cls2.equals(removelast.serializer())) {
                    if (removelast.serializer().equals(cls2)) {
                        return removelast.RemoteActionCompatParcelizer(emojiProcessor);
                    }
                }
            }
            getAlignmentLinesMap.write("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            return null;
        } catch (GeneralSecurityException unused2) {
            clsSerializer = null;
        }
    }

    public List IconCompatParcelizer(byte[] bArr) {
        int i = 2 % 2;
        List list = (List) ((ConcurrentMap) this.serializer).get(new lastIndexOf(bArr));
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
