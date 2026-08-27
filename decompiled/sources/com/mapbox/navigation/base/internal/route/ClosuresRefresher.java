package com.mapbox.navigation.base.internal.route;

import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.Incident;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class ClosuresRefresher extends RoadObjectsRefresher {
    public static final ClosuresRefresher INSTANCE = new ClosuresRefresher(AnonymousClass1.INSTANCE, AnonymousClass1.INSTANCE$9, AnonymousClass1.INSTANCE$10, AnonymousClass1.INSTANCE$11, AnonymousClass5.INSTANCE, AnonymousClass5.INSTANCE$1);

    /* JADX INFO: renamed from: com.mapbox.navigation.base.internal.route.ClosuresRefresher$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public static final AnonymousClass1 INSTANCE;
        public static final AnonymousClass1 INSTANCE$1;
        public static final AnonymousClass1 INSTANCE$10;
        public static final AnonymousClass1 INSTANCE$11;
        public static final AnonymousClass1 INSTANCE$12;
        public static final AnonymousClass1 INSTANCE$13;
        public static final AnonymousClass1 INSTANCE$14;
        public static final AnonymousClass1 INSTANCE$15;
        public static final AnonymousClass1 INSTANCE$2;
        public static final AnonymousClass1 INSTANCE$3;
        public static final AnonymousClass1 INSTANCE$4;
        public static final AnonymousClass1 INSTANCE$5;
        public static final AnonymousClass1 INSTANCE$6;
        public static final AnonymousClass1 INSTANCE$7;
        public static final AnonymousClass1 INSTANCE$8;
        public static final AnonymousClass1 INSTANCE$9;
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, int i2) {
            super(i);
            this.$r8$classId = i2;
        }

        static {
            int i = 1;
            INSTANCE$1 = new AnonymousClass1(i, i);
            INSTANCE$2 = new AnonymousClass1(i, 2);
            INSTANCE$3 = new AnonymousClass1(i, 3);
            INSTANCE$4 = new AnonymousClass1(i, 4);
            INSTANCE$5 = new AnonymousClass1(i, 5);
            INSTANCE$6 = new AnonymousClass1(i, 6);
            INSTANCE$7 = new AnonymousClass1(i, 7);
            INSTANCE$8 = new AnonymousClass1(i, 8);
            INSTANCE = new AnonymousClass1(i, 0);
            INSTANCE$9 = new AnonymousClass1(i, 9);
            INSTANCE$10 = new AnonymousClass1(i, 10);
            INSTANCE$11 = new AnonymousClass1(i, 11);
            INSTANCE$12 = new AnonymousClass1(i, 12);
            INSTANCE$13 = new AnonymousClass1(i, 13);
            INSTANCE$14 = new AnonymousClass1(i, 14);
            INSTANCE$15 = new AnonymousClass1(i, 15);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    Closure closure = (Closure) obj;
                    closure.getClass();
                    Closure.Builder builder = closure.toBuilder();
                    builder.getClass();
                    return builder;
                case 1:
                    LegAnnotation legAnnotation = (LegAnnotation) obj;
                    legAnnotation.getClass();
                    return legAnnotation.congestion();
                case 2:
                    LegAnnotation legAnnotation2 = (LegAnnotation) obj;
                    legAnnotation2.getClass();
                    return legAnnotation2.congestionNumeric();
                case 3:
                    LegAnnotation legAnnotation3 = (LegAnnotation) obj;
                    legAnnotation3.getClass();
                    return legAnnotation3.currentSpeed();
                case 4:
                    LegAnnotation legAnnotation4 = (LegAnnotation) obj;
                    legAnnotation4.getClass();
                    return legAnnotation4.distance();
                case 5:
                    LegAnnotation legAnnotation5 = (LegAnnotation) obj;
                    legAnnotation5.getClass();
                    return legAnnotation5.duration();
                case 6:
                    LegAnnotation legAnnotation6 = (LegAnnotation) obj;
                    legAnnotation6.getClass();
                    return legAnnotation6.freeflowSpeed();
                case 7:
                    LegAnnotation legAnnotation7 = (LegAnnotation) obj;
                    legAnnotation7.getClass();
                    return legAnnotation7.maxspeed();
                case 8:
                    LegAnnotation legAnnotation8 = (LegAnnotation) obj;
                    legAnnotation8.getClass();
                    return legAnnotation8.speed();
                case 9:
                    Closure.Builder builder2 = (Closure.Builder) obj;
                    builder2.getClass();
                    Closure closureBuild = builder2.build();
                    closureBuild.getClass();
                    return closureBuild;
                case 10:
                    Closure closure2 = (Closure) obj;
                    closure2.getClass();
                    return closure2.geometryIndexStart();
                case 11:
                    Closure closure3 = (Closure) obj;
                    closure3.getClass();
                    return closure3.geometryIndexEnd();
                case 12:
                    Incident incident = (Incident) obj;
                    incident.getClass();
                    Incident.Builder builder3 = incident.toBuilder();
                    builder3.getClass();
                    return builder3;
                case 13:
                    Incident.Builder builder4 = (Incident.Builder) obj;
                    builder4.getClass();
                    Incident incidentBuild = builder4.build();
                    incidentBuild.getClass();
                    return incidentBuild;
                case 14:
                    Incident incident2 = (Incident) obj;
                    incident2.getClass();
                    return incident2.geometryIndexStart();
                default:
                    Incident incident3 = (Incident) obj;
                    incident3.getClass();
                    return incident3.geometryIndexEnd();
            }
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.base.internal.route.ClosuresRefresher$5, reason: invalid class name */
    public final class AnonymousClass5 extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public static final AnonymousClass5 INSTANCE;
        public static final AnonymousClass5 INSTANCE$1;
        public static final AnonymousClass5 INSTANCE$2;
        public static final AnonymousClass5 INSTANCE$3;
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass5(int i, int i2) {
            super(i);
            this.$r8$classId = i2;
        }

        static {
            int i = 2;
            INSTANCE = new AnonymousClass5(i, 0);
            INSTANCE$1 = new AnonymousClass5(i, 1);
            INSTANCE$2 = new AnonymousClass5(i, i);
            INSTANCE$3 = new AnonymousClass5(i, 3);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.$r8$classId;
            if (i == 0) {
                Closure.Builder builder = (Closure.Builder) obj;
                int iIntValue = ((Number) obj2).intValue();
                builder.getClass();
                Closure.Builder builderGeometryIndexStart = builder.geometryIndexStart(Integer.valueOf(iIntValue));
                builderGeometryIndexStart.getClass();
                return builderGeometryIndexStart;
            }
            if (i == 1) {
                Closure.Builder builder2 = (Closure.Builder) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                builder2.getClass();
                Closure.Builder builderGeometryIndexEnd = builder2.geometryIndexEnd(Integer.valueOf(iIntValue2));
                builderGeometryIndexEnd.getClass();
                return builderGeometryIndexEnd;
            }
            if (i != 2) {
                Incident.Builder builder3 = (Incident.Builder) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                builder3.getClass();
                Incident.Builder builderGeometryIndexEnd2 = builder3.geometryIndexEnd(Integer.valueOf(iIntValue3));
                builderGeometryIndexEnd2.getClass();
                return builderGeometryIndexEnd2;
            }
            Incident.Builder builder4 = (Incident.Builder) obj;
            int iIntValue4 = ((Number) obj2).intValue();
            builder4.getClass();
            Incident.Builder builderGeometryIndexStart2 = builder4.geometryIndexStart(Integer.valueOf(iIntValue4));
            builderGeometryIndexStart2.getClass();
            return builderGeometryIndexStart2;
        }
    }

    public ClosuresRefresher(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) {
        super(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1);
    }
}
