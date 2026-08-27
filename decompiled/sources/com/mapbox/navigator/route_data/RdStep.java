package com.mapbox.navigator.route_data;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface RdStep {
    double distance();

    RdDrivingSide drivingSide();

    double duration();

    RdCoordinateArray geometry();

    RdIntersectionArray intersections();

    RdManeuver maneuver();

    String name();

    RdRoadShield roadShield();

    List<RdVoiceInstruction> voiceInstructions();
}
