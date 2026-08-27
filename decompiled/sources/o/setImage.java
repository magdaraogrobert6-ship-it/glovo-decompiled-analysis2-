package o;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.deliveryhero.fwf_http.ConstantKt;
import java.util.LinkedHashSet;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import leakcanary.ViewLocationHolderLeakFix$applyFix$2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MEDIA_SESSION_LEGACY_HELPER' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public abstract class setImage {
    private static final /* synthetic */ setImage[] $VALUES;
    public static final setImage ACCESSIBILITY_NODE_INFO;
    public static final setImage ACTIVITY_MANAGER;
    public static final setImage BUBBLE_POPUP;
    public static final setImage CONNECTIVITY_MANAGER;
    public static final setTextViewColor Companion;
    public static final setImage FLUSH_HANDLER_THREADS;
    public static final setImage IMM_CUR_ROOT_VIEW;
    public static final setImage IMM_FOCUSED_VIEW;
    public static final setImage LAST_HOVERED_VIEW;
    private static final String LG = "LGE";
    public static final setImage MEDIA_SESSION_LEGACY_HELPER;
    public static final setImage PERMISSION_CONTROLLER_MANAGER;
    private static final String SAMSUNG = "samsung";
    public static final setImage SAMSUNG_CLIPBOARD_MANAGER;
    public static final setImage SPELL_CHECKER;
    public static final setImage TEXT_LINE_POOL;
    public static final setImage USER_MANAGER;
    public static final setImage VIEW_LOCATION_HOLDER;
    private static final onViewDetachedFromWindowlambda1 backgroundHandler$delegate;
    private boolean applied;

    private setImage(String str, int i) {
        super(str, i);
    }

    public abstract void apply(Application application);

    public static setImage valueOf(String str) {
        return (setImage) Enum.valueOf(setImage.class, str);
    }

    public static setImage[] values() {
        return (setImage[]) $VALUES.clone();
    }

    public /* synthetic */ setImage(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    static {
        final String str = "MEDIA_SESSION_LEGACY_HELPER";
        final int i = 0;
        final DefaultConstructorMarker defaultConstructorMarker = null;
        setImage setimage = new setImage(str, i, defaultConstructorMarker) { // from class: o.r8lambdaBKQMGjk3iAugNKXlhRJEsr8gLwY
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
            }
        };
        MEDIA_SESSION_LEGACY_HELPER = setimage;
        final String str2 = "TEXT_LINE_POOL";
        final int i2 = 1;
        setImage setimage2 = new setImage(str2, i2, defaultConstructorMarker) { // from class: o.setAspectRatio
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
            }
        };
        TEXT_LINE_POOL = setimage2;
        final String str3 = "USER_MANAGER";
        final int i3 = 2;
        setImage setimage3 = new setImage(str3, i3, defaultConstructorMarker) { // from class: o.setCornersRadiiPx
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
            }
        };
        USER_MANAGER = setimage3;
        final String str4 = "FLUSH_HANDLER_THREADS";
        final int i4 = 3;
        setImage setimage4 = new setImage(str4, i4, defaultConstructorMarker) { // from class: o.InAppMessageViewUtilsWhenMappings
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
                if (Build.VERSION.SDK_INT >= 31) {
                    return;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                setImage.Companion.getClass();
                Looper looper = ((Handler) setImage.backgroundHandler$delegate.MediaSessionCompatResultReceiverWrapper()).getLooper();
                looper.getClass();
                Thread thread = looper.getThread();
                if (thread == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.os.HandlerThread");
                }
                linkedHashSet.add(Integer.valueOf(((HandlerThread) thread).getThreadId()));
                ((Handler) setImage.backgroundHandler$delegate.MediaSessionCompatResultReceiverWrapper()).postDelayed(new r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(8, linkedHashSet), ConstantKt.DEFAULT_REQUEST_TIMEOUT);
            }
        };
        FLUSH_HANDLER_THREADS = setimage4;
        final String str5 = "ACCESSIBILITY_NODE_INFO";
        final int i5 = 4;
        setImage setimage5 = new setImage(str5, i5, defaultConstructorMarker) { // from class: o.setDrawableColorFilter
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
            }
        };
        ACCESSIBILITY_NODE_INFO = setimage5;
        final String str6 = "CONNECTIVITY_MANAGER";
        final int i6 = 5;
        setImage setimage6 = new setImage(str6, i6, defaultConstructorMarker) { // from class: o.setDrawableColorlambda0
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
            }
        };
        CONNECTIVITY_MANAGER = setimage6;
        final String str7 = "SAMSUNG_CLIPBOARD_MANAGER";
        final int i7 = 6;
        setImage setimage7 = new setImage(str7, i7, defaultConstructorMarker) { // from class: o.onBackStartedlambda0
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
                Object[] objArr = {Build.MANUFACTURER, com.adjust.sdk.Constants.REFERRER_API_SAMSUNG};
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
            }
        };
        SAMSUNG_CLIPBOARD_MANAGER = setimage7;
        final String str8 = "BUBBLE_POPUP";
        final int i8 = 7;
        setImage setimage8 = new setImage(str8, i8, defaultConstructorMarker) { // from class: o.setIconlambda0
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
                Object[] objArr = {Build.MANUFACTURER, "LGE"};
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
            }
        };
        BUBBLE_POPUP = setimage8;
        final String str9 = "LAST_HOVERED_VIEW";
        final int i9 = 8;
        setImage setimage9 = new setImage(str9, i9, defaultConstructorMarker) { // from class: o.IInAppMessageBackEventListener
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
                Object[] objArr = {Build.MANUFACTURER, com.adjust.sdk.Constants.REFERRER_API_SAMSUNG};
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
            }
        };
        LAST_HOVERED_VIEW = setimage9;
        final String str10 = "ACTIVITY_MANAGER";
        final int i10 = 9;
        setImage setimage10 = new setImage(str10, i10, defaultConstructorMarker) { // from class: o.setTextAlignment
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
                Object[] objArr = {Build.MANUFACTURER, com.adjust.sdk.Constants.REFERRER_API_SAMSUNG};
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
            }
        };
        ACTIVITY_MANAGER = setimage10;
        final String str11 = "VIEW_LOCATION_HOLDER";
        final int i11 = 10;
        setImage setimage11 = new setImage(str11, i11, defaultConstructorMarker) { // from class: o.IInAppMessageImageView
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
                if (Build.VERSION.SDK_INT != 28) {
                    return;
                }
                ((r8lambda82HoCC3VgqgcCAapS2rEcPeH8yE) r8lambdaAefA9MLvnBCqdyzSHKyzHz6CMWE.serializer.MediaSessionCompatResultReceiverWrapper()).write.add(new IInAppMessageImmersiveView(application));
                application.registerActivityLifecycleCallbacks(new ViewLocationHolderLeakFix$applyFix$2(application));
            }
        };
        VIEW_LOCATION_HOLDER = setimage11;
        final String str12 = "IMM_FOCUSED_VIEW";
        final int i12 = 11;
        setImage setimage12 = new setImage(str12, i12, defaultConstructorMarker) { // from class: o.r8lambdakxsxIoNPdnwKqMkttVxi0GpICM
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
            }
        };
        IMM_FOCUSED_VIEW = setimage12;
        setViewBackgroundColor setviewbackgroundcolor = new setViewBackgroundColor("IMM_CUR_ROOT_VIEW", 12, null);
        IMM_CUR_ROOT_VIEW = setviewbackgroundcolor;
        final String str13 = "SPELL_CHECKER";
        final int i13 = 13;
        setImage setimage13 = new setImage(str13, i13, defaultConstructorMarker) { // from class: o.onBackCancelledlambda0
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
            }
        };
        SPELL_CHECKER = setimage13;
        final String str14 = "PERMISSION_CONTROLLER_MANAGER";
        final int i14 = 14;
        setImage setimage14 = new setImage(str14, i14, defaultConstructorMarker) { // from class: o.InAppMessageWebViewClient
            @Override // o.setImage
            public final void apply(Application application) {
                application.getClass();
                if (Build.VERSION.SDK_INT < 29) {
                    return;
                }
                try {
                    application.getSystemService("permission_controller");
                } catch (Exception unused) {
                }
            }
        };
        PERMISSION_CONTROLLER_MANAGER = setimage14;
        $VALUES = new setImage[]{setimage, setimage2, setimage3, setimage4, setimage5, setimage6, setimage7, setimage8, setimage9, setimage10, setimage11, setimage12, setviewbackgroundcolor, setimage13, setimage14};
        Companion = new setTextViewColor();
        backgroundHandler$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: o.InAppMessageViewUtilsExternalSyntheticLambda0
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                HandlerThread handlerThread = new HandlerThread("plumber-android-leaks");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }
}
