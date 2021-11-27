#!/usr/bin/env sh

set -e

tag="$(cat .version)"
git push -d origin "$tag"
git tag -f "$tag"
