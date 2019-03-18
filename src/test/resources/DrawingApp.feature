Feature: drawing app

Scenario: Draw Canvas
    Given Enter command to draw convas "C 20 4"
    Then Expect the canvas drawing 
""" 
----------------------
|                    |
|                    |
|                    |
|                    |
----------------------
"""
    And Exit the command "Q"