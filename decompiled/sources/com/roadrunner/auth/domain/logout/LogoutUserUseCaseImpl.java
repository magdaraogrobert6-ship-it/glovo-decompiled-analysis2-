package com.roadrunner.auth.domain.logout;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.auth.logout.domain.LogoutRequestExecutor$invoke$2;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.boundingRectInRoot;
import o.createFromParcel;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.getDisabled;
import o.getTextSelectionRangedelegate;
import o.getTraversalIndexdelegate;
import o.inCompatibilityMode;
import o.isContainer;
import o.metaMarkUpdatedAndHasCallbacks;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.scrollByOffset;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LogoutUserUseCaseImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final boundingRectInRoot IconCompatParcelizer;
    public final scrollByOffset MediaMetadataCompat;
    public final AppEventInfoChangeHandler RemoteActionCompatParcelizer;
    public final getDisabled read;
    public final getTextSelectionRangedelegate serializer;
    public final AuthRepository write;

    public LogoutUserUseCaseImpl(AuthRepository authRepository, getTextSelectionRangedelegate gettextselectionrangedelegate, boundingRectInRoot boundingrectinroot, scrollByOffset scrollbyoffset, AppEventInfoChangeHandler appEventInfoChangeHandler, getDisabled getdisabled) {
        authRepository.getClass();
        gettextselectionrangedelegate.getClass();
        boundingrectinroot.getClass();
        scrollbyoffset.getClass();
        appEventInfoChangeHandler.getClass();
        getdisabled.getClass();
        this.write = authRepository;
        this.serializer = gettextselectionrangedelegate;
        this.IconCompatParcelizer = boundingrectinroot;
        this.MediaMetadataCompat = scrollbyoffset;
        this.RemoteActionCompatParcelizer = appEventInfoChangeHandler;
        this.read = getdisabled;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final Object invoke(String str, ContinuationImpl continuationImpl) throws Throwable {
        isContainer iscontainer;
        int i;
        int i2;
        int i3;
        Object objRemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons;
        int i4;
        createFromParcel createfromparcel;
        String str2;
        getTraversalIndexdelegate gettraversalindexdelegate;
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksWrite;
        Object objWithContext;
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks;
        getTraversalIndexdelegate gettraversalindexdelegate2;
        int i5 = 2 % 2;
        int i6 = MediaBrowserCompatMediaItem + 7;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        int i7 = 0;
        if (i6 % 2 == 0) {
            if (continuationImpl instanceof isContainer) {
                iscontainer = (isContainer) continuationImpl;
                i = iscontainer.read;
                if ((i & Integer.MIN_VALUE) != 0) {
                    i2 = MediaBrowserCompatMediaItem + 109;
                    MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        i3 = i / Integer.MIN_VALUE;
                    } else {
                        i3 = i - Integer.MIN_VALUE;
                    }
                    iscontainer.read = i3;
                }
            }
            objRemoteActionCompatParcelizer = iscontainer.RemoteActionCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i4 = iscontainer.read;
            createfromparcel = createFromParcel.INSTANCE;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                decode decodeVar = this.read.write;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                ff$$ExternalSyntheticOutline0.m("trigger_reason", str2, decodeVar, "logout_started");
                iscontainer.read = 1;
                objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.write.serializer, iscontainer}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
                if (objRemoteActionCompatParcelizer != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            } else if (i4 == 2) {
                metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks2 = iscontainer.IconCompatParcelizer;
                gettraversalindexdelegate = iscontainer.write;
                ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                metamarkupdatedandhascallbacks = metamarkupdatedandhascallbacks2;
                gettraversalindexdelegate2 = gettraversalindexdelegate;
                if (gettraversalindexdelegate2 != null) {
                    iscontainer.write = null;
                    iscontainer.IconCompatParcelizer = null;
                    iscontainer.read = 3;
                    scrollByOffset scrollbyoffset = this.MediaMetadataCompat;
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = scrollbyoffset.IconCompatParcelizer;
                    ((inCompatibilityMode) scrollbyoffset.read).getClass();
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new LogoutRequestExecutor$invoke$2(scrollbyoffset, gettraversalindexdelegate2, metamarkupdatedandhascallbacks, null, 0), 2);
                    if (createfromparcel != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Auth data must exist to be able to logout", Timber.RemoteActionCompatParcelizer);
            } else {
                if (i4 != 3) {
                    int i8 = MediaBrowserCompatMediaItem + 63;
                    MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    if (i4 == 4) {
                        ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            }
            iscontainer.write = null;
            iscontainer.IconCompatParcelizer = null;
            iscontainer.read = 4;
            if (this.RemoteActionCompatParcelizer.refreshUserInfo(iscontainer) != coroutineSingletons) {
                return coroutineSingletons;
            }
            return createfromparcel;
            gettraversalindexdelegate = (getTraversalIndexdelegate) objRemoteActionCompatParcelizer;
            metamarkupdatedandhascallbacksWrite = this.IconCompatParcelizer.write();
            iscontainer.write = gettraversalindexdelegate;
            iscontainer.IconCompatParcelizer = metamarkupdatedandhascallbacksWrite;
            iscontainer.read = 2;
            getTextSelectionRangedelegate gettextselectionrangedelegate = this.serializer;
            ((inCompatibilityMode) gettextselectionrangedelegate.RatingCompat).getClass();
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ClearDataUseCaseImpl$invoke$2(gettextselectionrangedelegate, shortNewsContentCardView, i7), iscontainer);
            if (objWithContext != coroutineSingletons) {
                objWithContext = createfromparcel;
            }
            if (objWithContext == coroutineSingletons) {
                int i10 = MediaBrowserCompatMediaItem + 25;
                MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else {
                metamarkupdatedandhascallbacks = metamarkupdatedandhascallbacksWrite;
                gettraversalindexdelegate2 = gettraversalindexdelegate;
                if (gettraversalindexdelegate2 != null) {
                    iscontainer.write = null;
                    iscontainer.IconCompatParcelizer = null;
                    iscontainer.read = 3;
                    scrollByOffset scrollbyoffset2 = this.MediaMetadataCompat;
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = scrollbyoffset2.IconCompatParcelizer;
                    ((inCompatibilityMode) scrollbyoffset2.read).getClass();
                    DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new LogoutRequestExecutor$invoke$2(scrollbyoffset2, gettraversalindexdelegate2, metamarkupdatedandhascallbacks, null, 0), 2);
                    if (createfromparcel != coroutineSingletons) {
                    }
                } else {
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Auth data must exist to be able to logout", Timber.RemoteActionCompatParcelizer);
                }
                iscontainer.write = null;
                iscontainer.IconCompatParcelizer = null;
                iscontainer.read = 4;
                if (this.RemoteActionCompatParcelizer.refreshUserInfo(iscontainer) != coroutineSingletons) {
                    return createfromparcel;
                }
            }
            return coroutineSingletons;
        }
        int i12 = 16 / 0;
        if (continuationImpl instanceof isContainer) {
            iscontainer = (isContainer) continuationImpl;
            i = iscontainer.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                i2 = MediaBrowserCompatMediaItem + 109;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    i3 = i / Integer.MIN_VALUE;
                } else {
                    i3 = i - Integer.MIN_VALUE;
                }
                iscontainer.read = i3;
            }
        }
        objRemoteActionCompatParcelizer = iscontainer.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = iscontainer.read;
        createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            decode decodeVar2 = this.read.write;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            ff$$ExternalSyntheticOutline0.m("trigger_reason", str2, decodeVar2, "logout_started");
            iscontainer.read = 1;
            objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.write.serializer, iscontainer}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
            if (objRemoteActionCompatParcelizer != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        } else if (i4 == 2) {
            metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks3 = iscontainer.IconCompatParcelizer;
            gettraversalindexdelegate = iscontainer.write;
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            metamarkupdatedandhascallbacks = metamarkupdatedandhascallbacks3;
            gettraversalindexdelegate2 = gettraversalindexdelegate;
            if (gettraversalindexdelegate2 != null) {
                iscontainer.write = null;
                iscontainer.IconCompatParcelizer = null;
                iscontainer.read = 3;
                scrollByOffset scrollbyoffset3 = this.MediaMetadataCompat;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = scrollbyoffset3.IconCompatParcelizer;
                ((inCompatibilityMode) scrollbyoffset3.read).getClass();
                DefaultScheduler defaultScheduler4 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new LogoutRequestExecutor$invoke$2(scrollbyoffset3, gettraversalindexdelegate2, metamarkupdatedandhascallbacks, null, 0), 2);
                if (createfromparcel != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Auth data must exist to be able to logout", Timber.RemoteActionCompatParcelizer);
        } else {
            if (i4 != 3) {
                int i13 = MediaBrowserCompatMediaItem + 63;
                MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (i4 == 4) {
                    ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        }
        iscontainer.write = null;
        iscontainer.IconCompatParcelizer = null;
        iscontainer.read = 4;
        if (this.RemoteActionCompatParcelizer.refreshUserInfo(iscontainer) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return createfromparcel;
        gettraversalindexdelegate = (getTraversalIndexdelegate) objRemoteActionCompatParcelizer;
        metamarkupdatedandhascallbacksWrite = this.IconCompatParcelizer.write();
        iscontainer.write = gettraversalindexdelegate;
        iscontainer.IconCompatParcelizer = metamarkupdatedandhascallbacksWrite;
        iscontainer.read = 2;
        getTextSelectionRangedelegate gettextselectionrangedelegate2 = this.serializer;
        ((inCompatibilityMode) gettextselectionrangedelegate2.RatingCompat).getClass();
        DefaultScheduler defaultScheduler5 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ClearDataUseCaseImpl$invoke$2(gettextselectionrangedelegate2, shortNewsContentCardView2, i7), iscontainer);
        if (objWithContext != coroutineSingletons) {
            objWithContext = createfromparcel;
        }
        if (objWithContext == coroutineSingletons) {
            int i15 = MediaBrowserCompatMediaItem + 25;
            MediaDescriptionCompat = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        } else {
            metamarkupdatedandhascallbacks = metamarkupdatedandhascallbacksWrite;
            gettraversalindexdelegate2 = gettraversalindexdelegate;
            if (gettraversalindexdelegate2 != null) {
                iscontainer.write = null;
                iscontainer.IconCompatParcelizer = null;
                iscontainer.read = 3;
                scrollByOffset scrollbyoffset4 = this.MediaMetadataCompat;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout4 = scrollbyoffset4.IconCompatParcelizer;
                ((inCompatibilityMode) scrollbyoffset4.read).getClass();
                DefaultScheduler defaultScheduler6 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout4, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new LogoutRequestExecutor$invoke$2(scrollbyoffset4, gettraversalindexdelegate2, metamarkupdatedandhascallbacks, null, 0), 2);
                if (createfromparcel != coroutineSingletons) {
                }
            } else {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Auth data must exist to be able to logout", Timber.RemoteActionCompatParcelizer);
            }
            iscontainer.write = null;
            iscontainer.IconCompatParcelizer = null;
            iscontainer.read = 4;
            if (this.RemoteActionCompatParcelizer.refreshUserInfo(iscontainer) != coroutineSingletons) {
                return createfromparcel;
            }
        }
        return coroutineSingletons;
        iscontainer = new isContainer(this, continuationImpl);
        objRemoteActionCompatParcelizer = iscontainer.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = iscontainer.read;
        createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView3 = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            decode decodeVar3 = this.read.write;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            ff$$ExternalSyntheticOutline0.m("trigger_reason", str2, decodeVar3, "logout_started");
            iscontainer.read = 1;
            objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.write.serializer, iscontainer}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
            if (objRemoteActionCompatParcelizer != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        } else if (i4 == 2) {
            metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks4 = iscontainer.IconCompatParcelizer;
            gettraversalindexdelegate = iscontainer.write;
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            metamarkupdatedandhascallbacks = metamarkupdatedandhascallbacks4;
            gettraversalindexdelegate2 = gettraversalindexdelegate;
            if (gettraversalindexdelegate2 != null) {
                iscontainer.write = null;
                iscontainer.IconCompatParcelizer = null;
                iscontainer.read = 3;
                scrollByOffset scrollbyoffset5 = this.MediaMetadataCompat;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout5 = scrollbyoffset5.IconCompatParcelizer;
                ((inCompatibilityMode) scrollbyoffset5.read).getClass();
                DefaultScheduler defaultScheduler7 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout5, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new LogoutRequestExecutor$invoke$2(scrollbyoffset5, gettraversalindexdelegate2, metamarkupdatedandhascallbacks, null, 0), 2);
                if (createfromparcel != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Auth data must exist to be able to logout", Timber.RemoteActionCompatParcelizer);
        } else {
            if (i4 != 3) {
                int i17 = MediaBrowserCompatMediaItem + 63;
                MediaDescriptionCompat = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                if (i4 == 4) {
                    ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        }
        iscontainer.write = null;
        iscontainer.IconCompatParcelizer = null;
        iscontainer.read = 4;
        if (this.RemoteActionCompatParcelizer.refreshUserInfo(iscontainer) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return createfromparcel;
        gettraversalindexdelegate = (getTraversalIndexdelegate) objRemoteActionCompatParcelizer;
        metamarkupdatedandhascallbacksWrite = this.IconCompatParcelizer.write();
        iscontainer.write = gettraversalindexdelegate;
        iscontainer.IconCompatParcelizer = metamarkupdatedandhascallbacksWrite;
        iscontainer.read = 2;
        getTextSelectionRangedelegate gettextselectionrangedelegate3 = this.serializer;
        ((inCompatibilityMode) gettextselectionrangedelegate3.RatingCompat).getClass();
        DefaultScheduler defaultScheduler8 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ClearDataUseCaseImpl$invoke$2(gettextselectionrangedelegate3, shortNewsContentCardView3, i7), iscontainer);
        if (objWithContext != coroutineSingletons) {
            objWithContext = createfromparcel;
        }
        if (objWithContext == coroutineSingletons) {
            int i19 = MediaBrowserCompatMediaItem + 25;
            MediaDescriptionCompat = i19 % Fields.SpotShadowColor;
            int i110 = i19 % 2;
        } else {
            metamarkupdatedandhascallbacks = metamarkupdatedandhascallbacksWrite;
            gettraversalindexdelegate2 = gettraversalindexdelegate;
            if (gettraversalindexdelegate2 != null) {
                iscontainer.write = null;
                iscontainer.IconCompatParcelizer = null;
                iscontainer.read = 3;
                scrollByOffset scrollbyoffset6 = this.MediaMetadataCompat;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout6 = scrollbyoffset6.IconCompatParcelizer;
                ((inCompatibilityMode) scrollbyoffset6.read).getClass();
                DefaultScheduler defaultScheduler9 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout6, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new LogoutRequestExecutor$invoke$2(scrollbyoffset6, gettraversalindexdelegate2, metamarkupdatedandhascallbacks, null, 0), 2);
                if (createfromparcel != coroutineSingletons) {
                }
            } else {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Auth data must exist to be able to logout", Timber.RemoteActionCompatParcelizer);
            }
            iscontainer.write = null;
            iscontainer.IconCompatParcelizer = null;
            iscontainer.read = 4;
            if (this.RemoteActionCompatParcelizer.refreshUserInfo(iscontainer) != coroutineSingletons) {
                return createfromparcel;
            }
        }
        return coroutineSingletons;
    }
}
