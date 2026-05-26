.PHONY: setup run-dist

setup:
	cd app && sh gradlew clean install

run-dist:
	cd app && sh gradlew run