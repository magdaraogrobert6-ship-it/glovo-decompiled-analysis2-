package com.roadrunner.rider.state.quests.domain;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.rider.state.quests.data.QuestStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.addDate;
import o.addDouble;
import o.addDoubleWithoutRounding;
import o.addDuration;
import o.addInteger;
import o.addJsonObject;
import o.addMapJson;
import o.addString;
import o.buildAttributionPackage;
import o.buildClickPackage;
import o.buildGdprPackage;
import o.buildInfoPackage;
import o.buildMapping;
import o.containsFireIds;
import o.createFromParcel;
import o.dispatchChildDetached;
import o.getAttributionParameters;
import o.getCieXyz;
import o.getClickParameters;
import o.getEventSuffix;
import o.getFailureResponseData;
import o.getInfoParameters;
import o.getVerificationParameters;
import o.isTrackingEnabled;
import o.onPrimaryNavigationFragmentChanged;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.removeNodeAtDepth;
import o.setLastHorizontalStyle;
import o.timesmpE4wyQ;

/* JADX INFO: loaded from: classes3.dex */
public final class GetBannerUiState$invoke$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public /* synthetic */ getInfoParameters RemoteActionCompatParcelizer;
    public /* synthetic */ getFailureResponseData read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetBannerUiState$invoke$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(4, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = RatingCompat + 59;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj5 = this.write;
        if (i4 != 0) {
            GetBannerUiState$invoke$1 getBannerUiState$invoke$1 = new GetBannerUiState$invoke$1((BlockRunner) obj5, (ShortNewsContentCardView) obj4, 1);
            getBannerUiState$invoke$1.read = (getFailureResponseData) obj;
            getBannerUiState$invoke$1.RemoteActionCompatParcelizer = (getInfoParameters) obj2;
            getBannerUiState$invoke$1.serializer = (timesmpE4wyQ) obj3;
            return getBannerUiState$invoke$1.invokeSuspend(createfromparcel);
        }
        GetBannerUiState$invoke$1 getBannerUiState$invoke$2 = new GetBannerUiState$invoke$1((getVerificationParameters) obj5, (ShortNewsContentCardView) obj4, 0);
        getBannerUiState$invoke$2.serializer = (onPrimaryNavigationFragmentChanged) obj;
        getBannerUiState$invoke$2.read = (getFailureResponseData) obj2;
        getBannerUiState$invoke$2.RemoteActionCompatParcelizer = (getInfoParameters) obj3;
        Object objInvokeSuspend = getBannerUiState$invoke$2.invokeSuspend(createfromparcel);
        int i5 = MediaDescriptionCompat + 119;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x039c  */
    /* JADX WARN: Code duplicated, block: B:156:0x039f  */
    /* JADX WARN: Code duplicated, block: B:165:0x03be  */
    /* JADX WARN: Code duplicated, block: B:166:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:169:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:171:0x03df  */
    /* JADX WARN: Code duplicated, block: B:173:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:174:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:176:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:177:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:182:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0131 A[PHI: r14 r15
  0x0131: PHI (r14v10 int) = (r14v9 int), (r14v21 int) binds: [B:37:0x012f, B:34:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r15v7 int[]) = (r15v6 int[]), (r15v17 int[]) binds: [B:37:0x012f, B:34:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0134  */
    /* JADX WARN: Code duplicated, block: B:42:0x0142  */
    /* JADX WARN: Code duplicated, block: B:45:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:50:0x0162 A[PHI: r15 r17
  0x0162: PHI (r15v12 int[]) = (r15v6 int[]), (r15v17 int[]) binds: [B:37:0x012f, B:34:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r17v8 boolean) = (r17v2 boolean), (r17v13 boolean) binds: [B:37:0x012f, B:34:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0178  */
    /* JADX WARN: Code duplicated, block: B:57:0x0182  */
    /* JADX WARN: Code duplicated, block: B:59:0x018a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0198  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01df  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0217  */
    /* JADX WARN: Code duplicated, block: B:85:0x0235  */
    /* JADX WARN: Code duplicated, block: B:88:0x026a  */
    /* JADX WARN: Code duplicated, block: B:89:0x026f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0277  */
    /* JADX WARN: Code duplicated, block: B:93:0x0284  */
    /* JADX WARN: Code duplicated, block: B:96:0x0296  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:99:0x02bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        addDoubleWithoutRounding adddoublewithoutrounding;
        addDoubleWithoutRounding adddoublewithoutrounding2;
        setLastHorizontalStyle setlasthorizontalstyle;
        int i;
        long supportBackgroundTintList;
        setLastHorizontalStyle setlasthorizontalstyle2;
        int i2;
        long dropDownBackgroundResource;
        int i3;
        boolean zIsEmpty;
        int[] iArr;
        int i4;
        boolean z;
        int[] iArr2;
        long supportBackgroundTintMode;
        int i5;
        containsFireIds containsfireids;
        String str;
        int i6;
        long supportBackgroundTintList2;
        addInteger addinteger;
        String str2;
        addJsonObject addjsonobject;
        int i7;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        long jM732unboximpl;
        long jM732unboximpl2;
        float f;
        int i8;
        int i9;
        float f2;
        long jIconCompatParcelizer;
        long presenter;
        boolean z2;
        buildMapping buildmappingIconCompatParcelizer;
        int i10;
        int i11 = 2;
        int i12 = 2 % 2;
        int i13 = this.IconCompatParcelizer;
        Object obj3 = this.write;
        if (i13 == 0) {
            buildGdprPackage buildgdprpackage = ((getVerificationParameters) obj3).serializer;
            onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = (onPrimaryNavigationFragmentChanged) this.serializer;
            getFailureResponseData getfailureresponsedata = this.read;
            getInfoParameters getinfoparameters = this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            boolean z3 = onprimarynavigationfragmentchanged == onPrimaryNavigationFragmentChanged.COLLAPSED;
            boolean z4 = getfailureresponsedata.RemoteActionCompatParcelizer == isTrackingEnabled.NOT_WORKING;
            getAttributionParameters getattributionparameters = getinfoparameters != null ? getinfoparameters.banner : null;
            if (!z3 || !z4 || getattributionparameters == null) {
                return addDouble.serializer;
            }
            QuestStatus questStatus = getattributionparameters.status;
            String str3 = getattributionparameters.title;
            String str4 = getattributionparameters.description;
            String str5 = getattributionparameters.url;
            String str6 = getattributionparameters.iconUrl;
            getEventSuffix geteventsuffix = getattributionparameters.progress;
            boolean z5 = (geteventsuffix != null ? geteventsuffix.percentage : 0.0f) == 0.0f;
            float f3 = geteventsuffix != null ? geteventsuffix.percentage : 0.0f;
            int i14 = (geteventsuffix != null ? geteventsuffix.goalCount : 0) - 1;
            int i15 = i14 < 0 ? 0 : i14;
            questStatus.getClass();
            int[] iArr3 = buildInfoPackage.IconCompatParcelizer;
            int i16 = iArr3[questStatus.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    obj2 = null;
                    adddoublewithoutrounding = addDoubleWithoutRounding.FAILING;
                } else {
                    if (i16 == 3) {
                        int i17 = MediaDescriptionCompat + 87;
                        RatingCompat = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 != 0) {
                            addDoubleWithoutRounding adddoublewithoutrounding3 = addDoubleWithoutRounding.NONE;
                            throw null;
                        }
                        adddoublewithoutrounding2 = addDoubleWithoutRounding.NONE;
                        obj2 = null;
                        setlasthorizontalstyle = buildgdprpackage.IconCompatParcelizer;
                        i = iArr3[questStatus.ordinal()];
                        if (i != 1) {
                            supportBackgroundTintList = setlasthorizontalstyle.IconCompatParcelizer().setSupportBackgroundTintList();
                        } else if (i != 2) {
                            i3 = MediaDescriptionCompat + 119;
                            RatingCompat = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 != 0 ? i != 3 : i != 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            } else {
                                supportBackgroundTintList = setlasthorizontalstyle.IconCompatParcelizer().setCompoundDrawablesRelative();
                            }
                        } else {
                            supportBackgroundTintList = setlasthorizontalstyle.IconCompatParcelizer().read();
                        }
                        long j = supportBackgroundTintList;
                        setlasthorizontalstyle2 = buildgdprpackage.IconCompatParcelizer;
                        i2 = iArr3[questStatus.ordinal()];
                        if (i2 != 1) {
                            dropDownBackgroundResource = setlasthorizontalstyle2.IconCompatParcelizer().setDropDownBackgroundResource();
                        } else if (i2 != 2) {
                            dropDownBackgroundResource = setlasthorizontalstyle2.IconCompatParcelizer().RemoteActionCompatParcelizer();
                        } else if (i2 != 3) {
                            dropDownBackgroundResource = setlasthorizontalstyle2.IconCompatParcelizer().setKeyListener();
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        return new addDate(str3, str4, str5, str6, !z5, f3, i15, adddoublewithoutrounding2, j, dropDownBackgroundResource);
                    }
                    obj2 = null;
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                }
                return obj2;
            }
            obj2 = null;
            adddoublewithoutrounding = addDoubleWithoutRounding.ONGOING;
            adddoublewithoutrounding2 = adddoublewithoutrounding;
            setlasthorizontalstyle = buildgdprpackage.IconCompatParcelizer;
            i = iArr3[questStatus.ordinal()];
            if (i != 1) {
                supportBackgroundTintList = setlasthorizontalstyle.IconCompatParcelizer().setSupportBackgroundTintList();
            } else {
                if (i != 2) {
                    i3 = MediaDescriptionCompat + 119;
                    RatingCompat = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    }
                    return obj2;
                }
                supportBackgroundTintList = setlasthorizontalstyle.IconCompatParcelizer().read();
            }
            long j2 = supportBackgroundTintList;
            setlasthorizontalstyle2 = buildgdprpackage.IconCompatParcelizer;
            i2 = iArr3[questStatus.ordinal()];
            if (i2 != 1) {
                dropDownBackgroundResource = setlasthorizontalstyle2.IconCompatParcelizer().setDropDownBackgroundResource();
            } else if (i2 != 2) {
                dropDownBackgroundResource = setlasthorizontalstyle2.IconCompatParcelizer().RemoteActionCompatParcelizer();
            } else {
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return obj2;
                }
                dropDownBackgroundResource = setlasthorizontalstyle2.IconCompatParcelizer().setKeyListener();
            }
            return new addDate(str3, str4, str5, str6, !z5, f3, i15, adddoublewithoutrounding2, j2, dropDownBackgroundResource);
        }
        getFailureResponseData getfailureresponsedata2 = this.read;
        getInfoParameters getinfoparameters2 = this.RemoteActionCompatParcelizer;
        timesmpE4wyQ timesmpe4wyq = (timesmpE4wyQ) this.serializer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        BlockRunner blockRunner = (BlockRunner) obj3;
        if (((RiderStateRepositoryImpl) ((dispatchChildDetached) blockRunner.IconCompatParcelizer)).write()) {
            zIsEmpty = true;
        } else {
            switch (buildClickPackage.write[getfailureresponsedata2.RemoteActionCompatParcelizer.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    zIsEmpty = false;
                    break;
                case 9:
                case 10:
                    zIsEmpty = timesmpe4wyq.MediaBrowserCompatMediaItem.isEmpty();
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
            }
        }
        List list = getinfoparameters2 != null ? getinfoparameters2.quests : null;
        boolean z6 = list == null || list.isEmpty();
        if (!zIsEmpty || z6) {
            return addDuration.serializer;
        }
        String str7 = getinfoparameters2.title;
        String str8 = getinfoparameters2.headerActionText;
        String str9 = getinfoparameters2.headerActionUrl;
        String str10 = getinfoparameters2.footerActionText;
        String str11 = getinfoparameters2.footerActionUrl;
        List list2 = getinfoparameters2.quests;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i18 = RatingCompat + 55;
            MediaDescriptionCompat = i18 % Fields.SpotShadowColor;
            int i19 = i18 % i11;
            getClickParameters getclickparameters = (getClickParameters) it.next();
            String str12 = getclickparameters.questId;
            String str13 = getclickparameters.name;
            String str14 = getclickparameters.questDetailUrl;
            String str15 = getclickparameters.timeFrame;
            String str16 = getclickparameters.questState;
            buildAttributionPackage buildattributionpackage = getclickparameters.rewardTag;
            Iterator it2 = it;
            QuestStatus questStatus2 = getclickparameters.status;
            getEventSuffix geteventsuffix2 = getclickparameters.progress;
            String str17 = str11;
            setLastHorizontalStyle setlasthorizontalstyle3 = (setLastHorizontalStyle) blockRunner.RemoteActionCompatParcelizer;
            Float fValueOf = geteventsuffix2 != null ? Float.valueOf(geteventsuffix2.percentage) : null;
            String str18 = str10;
            int i20 = RatingCompat + 45;
            String str19 = str9;
            MediaDescriptionCompat = i20 % Fields.SpotShadowColor;
            if (i20 % 2 == 0) {
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), -531493232, 531493233, getCieXyz.write(), getCieXyz.write(), new Object[]{fValueOf, Float.valueOf(2.0f)}, getCieXyz.write())).booleanValue();
                iArr = buildClickPackage.RemoteActionCompatParcelizer;
                i4 = iArr[questStatus2.ordinal()];
                z = zBooleanValue;
                if (i4 == 1) {
                    z2 = z;
                    buildmappingIconCompatParcelizer = setlasthorizontalstyle3.IconCompatParcelizer();
                    if (z2) {
                        i10 = RatingCompat + 79;
                        iArr2 = iArr;
                        MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 != 0) {
                            buildmappingIconCompatParcelizer.setSupportBackgroundTintList();
                            throw null;
                        }
                        supportBackgroundTintMode = buildmappingIconCompatParcelizer.setSupportBackgroundTintList();
                    } else {
                        iArr2 = iArr;
                        supportBackgroundTintMode = buildmappingIconCompatParcelizer.getSupportBackgroundTintMode();
                    }
                } else if (i4 != 2) {
                    i5 = RatingCompat + 107;
                    iArr2 = iArr;
                    MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        if (i4 != 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        supportBackgroundTintMode = setlasthorizontalstyle3.IconCompatParcelizer().getSupportBackgroundTintMode();
                    } else {
                        if (i4 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        supportBackgroundTintMode = setlasthorizontalstyle3.IconCompatParcelizer().getSupportBackgroundTintMode();
                    }
                } else {
                    iArr2 = iArr;
                    supportBackgroundTintMode = setlasthorizontalstyle3.IconCompatParcelizer().read();
                }
                if (buildattributionpackage != null) {
                    containsfireids = new containsFireIds(buildattributionpackage.text, buildattributionpackage.description, supportBackgroundTintMode);
                } else {
                    containsfireids = null;
                }
                str = getclickparameters.earning;
                i6 = iArr2[questStatus2.ordinal()];
                if (i6 != 1) {
                    supportBackgroundTintList2 = setlasthorizontalstyle3.IconCompatParcelizer().setSupportBackgroundTintList();
                } else if (i6 != 2) {
                    int i21 = RatingCompat + 89;
                    MediaDescriptionCompat = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    if (i6 == 3) {
                        supportBackgroundTintList2 = setlasthorizontalstyle3.IconCompatParcelizer().getSupportBackgroundTintMode();
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    }
                } else {
                    supportBackgroundTintList2 = setlasthorizontalstyle3.IconCompatParcelizer().read();
                }
                if (str != null) {
                    addinteger = new addInteger(str, supportBackgroundTintList2);
                } else {
                    addinteger = null;
                }
                str2 = getclickparameters.iconUrl;
                if (geteventsuffix2 != null) {
                    i7 = iArr2[questStatus2.ordinal()];
                    if (i7 != 1) {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().setSupportBackgroundTintList()), Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().setDropDownBackgroundResource()));
                    } else if (i7 != 2) {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().read()), Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().RemoteActionCompatParcelizer()));
                    } else if (i7 == 3) {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().setCompoundDrawablesRelative()), Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().setKeyListener()));
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    }
                    jM732unboximpl = ((Color) onviewattachedtowindowlambda0.serializer).m732unboximpl();
                    jM732unboximpl2 = ((Color) onviewattachedtowindowlambda0.write).m732unboximpl();
                    f = geteventsuffix2.percentage;
                    i8 = geteventsuffix2.goalCount - 1;
                    if (i8 < 0) {
                        f2 = 1.0f;
                        i9 = 0;
                    } else {
                        i9 = i8;
                        f2 = 1.0f;
                    }
                    if (f == f2) {
                        int i23 = MediaDescriptionCompat + 29;
                        RatingCompat = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        jIconCompatParcelizer = jM732unboximpl2;
                    } else {
                        jIconCompatParcelizer = setlasthorizontalstyle3.IconCompatParcelizer().IconCompatParcelizer();
                    }
                    if (geteventsuffix2.percentage == 1.0f) {
                        int i25 = RatingCompat + 107;
                        MediaDescriptionCompat = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        presenter = jM732unboximpl;
                    } else {
                        presenter = setlasthorizontalstyle3.IconCompatParcelizer().setPresenter();
                    }
                    addjsonobject = new addJsonObject(f, i9, jM732unboximpl, jIconCompatParcelizer, jM732unboximpl2, presenter, str2);
                } else {
                    addjsonobject = null;
                }
                arrayList.add(new addMapJson(str12, str13, str14, str15, str16, containsfireids, addinteger, addjsonobject));
                it = it2;
                str11 = str17;
                blockRunner = blockRunner;
                str10 = str18;
                str9 = str19;
                str8 = str8;
                i11 = 2;
            } else {
                boolean zBooleanValue2 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), -531493232, 531493233, getCieXyz.write(), getCieXyz.write(), new Object[]{fValueOf, Float.valueOf(1.0f)}, getCieXyz.write())).booleanValue();
                iArr = buildClickPackage.RemoteActionCompatParcelizer;
                i4 = iArr[questStatus2.ordinal()];
                z = zBooleanValue2;
                if (i4 == 1) {
                    z2 = z;
                    buildmappingIconCompatParcelizer = setlasthorizontalstyle3.IconCompatParcelizer();
                    if (z2) {
                        i10 = RatingCompat + 79;
                        iArr2 = iArr;
                        MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 != 0) {
                            buildmappingIconCompatParcelizer.setSupportBackgroundTintList();
                            throw null;
                        }
                        supportBackgroundTintMode = buildmappingIconCompatParcelizer.setSupportBackgroundTintList();
                    } else {
                        iArr2 = iArr;
                        supportBackgroundTintMode = buildmappingIconCompatParcelizer.getSupportBackgroundTintMode();
                    }
                } else if (i4 != 2) {
                    i5 = RatingCompat + 107;
                    iArr2 = iArr;
                    MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        if (i4 != 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        supportBackgroundTintMode = setlasthorizontalstyle3.IconCompatParcelizer().getSupportBackgroundTintMode();
                    } else {
                        if (i4 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        supportBackgroundTintMode = setlasthorizontalstyle3.IconCompatParcelizer().getSupportBackgroundTintMode();
                    }
                } else {
                    iArr2 = iArr;
                    supportBackgroundTintMode = setlasthorizontalstyle3.IconCompatParcelizer().read();
                }
                if (buildattributionpackage != null) {
                    containsfireids = new containsFireIds(buildattributionpackage.text, buildattributionpackage.description, supportBackgroundTintMode);
                } else {
                    containsfireids = null;
                }
                str = getclickparameters.earning;
                i6 = iArr2[questStatus2.ordinal()];
                if (i6 != 1) {
                    supportBackgroundTintList2 = setlasthorizontalstyle3.IconCompatParcelizer().setSupportBackgroundTintList();
                } else if (i6 != 2) {
                    int i27 = RatingCompat + 89;
                    MediaDescriptionCompat = i27 % Fields.SpotShadowColor;
                    int i28 = i27 % 2;
                    if (i6 == 3) {
                        supportBackgroundTintList2 = setlasthorizontalstyle3.IconCompatParcelizer().getSupportBackgroundTintMode();
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    }
                } else {
                    supportBackgroundTintList2 = setlasthorizontalstyle3.IconCompatParcelizer().read();
                }
                if (str != null) {
                    addinteger = new addInteger(str, supportBackgroundTintList2);
                } else {
                    addinteger = null;
                }
                str2 = getclickparameters.iconUrl;
                if (geteventsuffix2 != null) {
                    i7 = iArr2[questStatus2.ordinal()];
                    if (i7 != 1) {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().setSupportBackgroundTintList()), Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().setDropDownBackgroundResource()));
                    } else if (i7 != 2) {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().read()), Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().RemoteActionCompatParcelizer()));
                    } else if (i7 == 3) {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().setCompoundDrawablesRelative()), Color.m712boximpl(setlasthorizontalstyle3.IconCompatParcelizer().setKeyListener()));
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    }
                    jM732unboximpl = ((Color) onviewattachedtowindowlambda0.serializer).m732unboximpl();
                    jM732unboximpl2 = ((Color) onviewattachedtowindowlambda0.write).m732unboximpl();
                    f = geteventsuffix2.percentage;
                    i8 = geteventsuffix2.goalCount - 1;
                    if (i8 < 0) {
                        f2 = 1.0f;
                        i9 = 0;
                    } else {
                        i9 = i8;
                        f2 = 1.0f;
                    }
                    if (f == f2) {
                        int i29 = MediaDescriptionCompat + 29;
                        RatingCompat = i29 % Fields.SpotShadowColor;
                        int i210 = i29 % 2;
                        jIconCompatParcelizer = jM732unboximpl2;
                    } else {
                        jIconCompatParcelizer = setlasthorizontalstyle3.IconCompatParcelizer().IconCompatParcelizer();
                    }
                    if (geteventsuffix2.percentage == 1.0f) {
                        int i211 = RatingCompat + 107;
                        MediaDescriptionCompat = i211 % Fields.SpotShadowColor;
                        int i212 = i211 % 2;
                        presenter = jM732unboximpl;
                    } else {
                        presenter = setlasthorizontalstyle3.IconCompatParcelizer().setPresenter();
                    }
                    addjsonobject = new addJsonObject(f, i9, jM732unboximpl, jIconCompatParcelizer, jM732unboximpl2, presenter, str2);
                } else {
                    addjsonobject = null;
                }
                arrayList.add(new addMapJson(str12, str13, str14, str15, str16, containsfireids, addinteger, addjsonobject));
                it = it2;
                str11 = str17;
                blockRunner = blockRunner;
                str10 = str18;
                str9 = str19;
                str8 = str8;
                i11 = 2;
            }
            return null;
        }
        return new addString(str7, str8, str9, str10, str11, arrayList);
    }
}
