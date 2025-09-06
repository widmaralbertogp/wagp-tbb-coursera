#!/bin/bash
adb forward tcp:8022 tcp:8022
ssh -p 8022 u0_a260@localhost
