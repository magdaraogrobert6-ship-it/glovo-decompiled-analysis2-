package com.roadrunner.delivery.accept.autoaccept.presentation.compose;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import coil3.compose.AsyncImagePainter;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.LayoutCompatBreakStrategy;
import o.LayoutCompatHyphenationFrequency;
import o.LayoutCompatJustificationMode;
import o.LinearGradientShaderVjE6UOU;
import o.LinearGradientShaderVjE6UOUdefault;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RadioButton;
import o.SweepGradientShader9KIMszo;
import o.accessgetLayerBlockp;
import o.buildMapping;
import o.component4;
import o.computeDirection;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getOffsetF1C5BW0annotations;
import o.getPostalCode;
import o.getType;
import o.getWordDRrd7Zo;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCurrentSemanticsNodesui;
import o.setExitSharedElementCallback;
import o.setTransformQ8lPUPs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EarningsExtraLargeBubbleContentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:77:0x027a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x027b  */
    public static final void EarningsExtraLargeBubbleContent(final getWordDRrd7Zo getworddrrd7zo, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final int i3;
        getPostalCode getpostalcode;
        int i4;
        Object obj;
        boolean zIconCompatParcelizer;
        int i5 = 2;
        int i6 = 2 % 2;
        getworddrrd7zo.getClass();
        setExitSharedElementCallback setexitsharedelementcallback = getworddrrd7zo.serializer;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1791487712);
        int i7 = getpostalcode2.ComponentActivity ? -getpostalcode2.onBackPressedDispatcher_delegatelambda00.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus : getpostalcode2.createFullyDrawnExecutor.PlaybackStateCompat;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(getworddrrd7zo);
                int i8 = serializer + 21;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getworddrrd7zo);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 19) != 18)) {
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.setLogo);
            modifierWrite.getClass();
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i10 = RemoteActionCompatParcelizer + 79;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    getpostalcode2.serializer(constructor);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                getpostalcode2.serializer(constructor);
                obj = null;
            } else {
                obj = null;
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getpostalcode2.serializer(1252836850);
            getpostalcode2.serializer(1252856689);
            int i11 = setexitsharedelementcallback.IconCompatParcelizer;
            setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            if (((Boolean) getpostalcode2.write((getNewPassword) InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                Extras$Key extras$Key = LinearGradientShaderVjE6UOU.MediaDescriptionCompat;
                settransformq8lpups.PlaybackStateCompatCustomAction = new SweepGradientShader9KIMszo(i11, i5);
            }
            settransformq8lpups.IconCompatParcelizer = Integer.valueOf(i11);
            settransformq8lpups.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new getOffsetF1C5BW0annotations(accessgetLayerBlockp.serializer);
            LinearGradientShaderVjE6UOUdefault.write(settransformq8lpups);
            AsyncImagePainter asyncImagePainterRemoteActionCompatParcelizer = computeDirection.RemoteActionCompatParcelizer(settransformq8lpups.IconCompatParcelizer(), null, null, getpostalcode2, 0, 30);
            Modifier.Companion companion3 = Modifier.Companion;
            final int i12 = 0;
            ImageKt.Image(asyncImagePainterRemoteActionCompatParcelizer, null, SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(companion3, Dimensions.peekAvailableContext), Dimensions.removeOnConfigurationChangedListener).then(new RadioButton(companion.getCenterHorizontally())), null, null, 0.0f, null, getpostalcode2, 48, 120);
            getpostalcode2.IconCompatParcelizer(false);
            String str = getworddrrd7zo.write;
            TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
            long presenter = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
            FontWeight w700 = FontWeight.Companion.getW700();
            int iM3511getCentere0LSkKk = TextAlign.Companion.m3511getCentere0LSkKk();
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.IconCompatParcelizer(SizeKt.write(companion3, 1.0f), null, 3), 0.0f, Dimensions.setActionBarVisibilityCallback, 0.0f, 0.0f, 13);
            modifierM74paddingqDBjuR0$default.getClass();
            TextKt.m131TextNvy7gAk(str, modifierM74paddingqDBjuR0$default, presenter, 0L, w700, null, 0L, TextAlign.m3504boximpl(iM3511getCentere0LSkKk), 0L, 0, false, 1, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode2, 1572864, 24576, 113592);
            LayoutCompatBreakStrategy layoutCompatBreakStrategy = getworddrrd7zo.IconCompatParcelizer;
            if (layoutCompatBreakStrategy == null || layoutCompatBreakStrategy.equals(LayoutCompatHyphenationFrequency.RemoteActionCompatParcelizer)) {
                if (i7 >= 0) {
                    if (getpostalcode2.ComponentActivity) {
                        getType gettype = getpostalcode2.onBackPressedDispatcher_delegatelambda00;
                        while (getpostalcode2.ComponentActivity) {
                            int i13 = RemoteActionCompatParcelizer + 103;
                            serializer = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            getpostalcode2.IconCompatParcelizer(gettype.MediaSessionCompatResultReceiverWrapper(gettype.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus));
                        }
                    }
                    component4 component4Var = getpostalcode2.createFullyDrawnExecutor;
                    while (true) {
                        int i15 = component4Var.PlaybackStateCompat;
                        if (i15 <= i7) {
                            break;
                        } else {
                            getpostalcode2.IconCompatParcelizer(component4Var.MediaBrowserCompatMediaItem(i15));
                        }
                    }
                } else {
                    int i16 = -i7;
                    getType gettype2 = getpostalcode2.onBackPressedDispatcher_delegatelambda00;
                    while (true) {
                        int i17 = gettype2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        if (i17 <= i16) {
                            break;
                        }
                        int i18 = serializer + 89;
                        RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        getpostalcode2.IconCompatParcelizer(gettype2.MediaSessionCompatResultReceiverWrapper(i17));
                        int i20 = RemoteActionCompatParcelizer + 37;
                        serializer = i20 % Fields.SpotShadowColor;
                        int i21 = i20 % 2;
                    }
                }
                getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TextInclusionStrategyCompanion
                        private static int MediaBrowserCompatMediaItem = 1;
                        private static int serializer;

                        /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
                        
                            if ((r7 % 2) != 0) goto L12;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
                        
                            r7 = 34 / 0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
                        
                            return r2;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
                        
                            com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsExtraLargeBubbleContentKt.EarningsExtraLargeBubbleContent(r5, r4, r7, o.ContentType_androidKt.RemoteActionCompatParcelizer(r3 | 1));
                            r7 = o.TextInclusionStrategyCompanion.serializer + 117;
                            o.TextInclusionStrategyCompanion.MediaBrowserCompatMediaItem = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            r7 = r7 % 2;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
                        
                            return r2;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
                        
                            if (r1 != 0) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
                        
                            if (r1 != 0) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
                        
                            com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsExtraLargeBubbleContentKt.EarningsExtraLargeBubbleContent(r5, r4, r7, o.ContentType_androidKt.RemoteActionCompatParcelizer(r3 | 1));
                            r7 = o.TextInclusionStrategyCompanion.serializer + 121;
                            o.TextInclusionStrategyCompanion.MediaBrowserCompatMediaItem = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                         */
                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                            /*
                                r6 = this;
                                r0 = 2
                                int r1 = r0 % r0
                                int r1 = o.TextInclusionStrategyCompanion.serializer
                                int r1 = r1 + 77
                                int r2 = r1 % 128
                                o.TextInclusionStrategyCompanion.MediaBrowserCompatMediaItem = r2
                                int r1 = r1 % r0
                                if (r1 != 0) goto L25
                                int r1 = r4
                                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                int r3 = r3
                                androidx.compose.ui.Modifier r4 = r2
                                o.getWordDRrd7Zo r5 = r1
                                o.getBirthDateFull r7 = (o.getBirthDateFull) r7
                                java.lang.Integer r8 = (java.lang.Integer) r8
                                r8.getClass()
                                r8 = 7
                                int r8 = r8 / 0
                                if (r1 == 0) goto L51
                                goto L38
                            L25:
                                int r1 = r4
                                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                int r3 = r3
                                androidx.compose.ui.Modifier r4 = r2
                                o.getWordDRrd7Zo r5 = r1
                                o.getBirthDateFull r7 = (o.getBirthDateFull) r7
                                java.lang.Integer r8 = (java.lang.Integer) r8
                                r8.getClass()
                                if (r1 == 0) goto L51
                            L38:
                                r8 = r3 | 1
                                int r8 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r8)
                                com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsExtraLargeBubbleContentKt.EarningsExtraLargeBubbleContent(r5, r4, r7, r8)
                                int r7 = o.TextInclusionStrategyCompanion.serializer
                                int r7 = r7 + 121
                                int r8 = r7 % 128
                                o.TextInclusionStrategyCompanion.MediaBrowserCompatMediaItem = r8
                                int r7 = r7 % r0
                                if (r7 != 0) goto L50
                                r7 = 34
                                int r7 = r7 / 0
                            L50:
                                return r2
                            L51:
                                r8 = r3 | 1
                                int r8 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r8)
                                com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsExtraLargeBubbleContentKt.EarningsExtraLargeBubbleContent(r5, r4, r7, r8)
                                int r7 = o.TextInclusionStrategyCompanion.serializer
                                int r7 = r7 + 117
                                int r8 = r7 % 128
                                o.TextInclusionStrategyCompanion.MediaBrowserCompatMediaItem = r8
                                int r7 = r7 % r0
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.TextInclusionStrategyCompanion.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    };
                    return;
                }
            } else {
                getpostalcode = getpostalcode2;
                EarningsComposableKt.read((LayoutCompatJustificationMode) layoutCompatBreakStrategy, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, Dimensions.setMenu, 0.0f, 0.0f, 13), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
                i3 = 1;
                getpostalcode.IconCompatParcelizer(true);
            }
            i4 = RemoteActionCompatParcelizer + 27;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
        i3 = 1;
        getpostalcode = getpostalcode2;
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 != null) {
            gethandleruiannotationsMediaDescriptionCompat2.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TextInclusionStrategyCompanion
                private static int MediaBrowserCompatMediaItem = 1;
                private static int serializer;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                    /*
                        r6 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = o.TextInclusionStrategyCompanion.serializer
                        int r1 = r1 + 77
                        int r2 = r1 % 128
                        o.TextInclusionStrategyCompanion.MediaBrowserCompatMediaItem = r2
                        int r1 = r1 % r0
                        if (r1 != 0) goto L25
                        int r1 = r4
                        o.createFromParcel r2 = o.createFromParcel.INSTANCE
                        int r3 = r3
                        androidx.compose.ui.Modifier r4 = r2
                        o.getWordDRrd7Zo r5 = r1
                        o.getBirthDateFull r7 = (o.getBirthDateFull) r7
                        java.lang.Integer r8 = (java.lang.Integer) r8
                        r8.getClass()
                        r8 = 7
                        int r8 = r8 / 0
                        if (r1 == 0) goto L51
                        goto L38
                    L25:
                        int r1 = r4
                        o.createFromParcel r2 = o.createFromParcel.INSTANCE
                        int r3 = r3
                        androidx.compose.ui.Modifier r4 = r2
                        o.getWordDRrd7Zo r5 = r1
                        o.getBirthDateFull r7 = (o.getBirthDateFull) r7
                        java.lang.Integer r8 = (java.lang.Integer) r8
                        r8.getClass()
                        if (r1 == 0) goto L51
                    L38:
                        r8 = r3 | 1
                        int r8 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r8)
                        com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsExtraLargeBubbleContentKt.EarningsExtraLargeBubbleContent(r5, r4, r7, r8)
                        int r7 = o.TextInclusionStrategyCompanion.serializer
                        int r7 = r7 + 121
                        int r8 = r7 % 128
                        o.TextInclusionStrategyCompanion.MediaBrowserCompatMediaItem = r8
                        int r7 = r7 % r0
                        if (r7 != 0) goto L50
                        r7 = 34
                        int r7 = r7 / 0
                    L50:
                        return r2
                    L51:
                        r8 = r3 | 1
                        int r8 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r8)
                        com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsExtraLargeBubbleContentKt.EarningsExtraLargeBubbleContent(r5, r4, r7, r8)
                        int r7 = o.TextInclusionStrategyCompanion.serializer
                        int r7 = r7 + 117
                        int r8 = r7 % 128
                        o.TextInclusionStrategyCompanion.MediaBrowserCompatMediaItem = r8
                        int r7 = r7 % r0
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.TextInclusionStrategyCompanion.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            };
        }
        i4 = RemoteActionCompatParcelizer + 27;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
