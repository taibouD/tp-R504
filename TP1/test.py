import pytest
import fonctions as f

def test_1 ( ) :
	assert f.puissance ( 2 , 3 ) == 8
	assert f.puissance ( 2 , 2 ) == 4
	
def test_2 ( ) :
	assert f.puissance ( 1 , 1 ) == 1
	assert f.puissance ( 2, 1 ) == 2
	
def test_3 ( ) :
  if f.puissance (0,-2)
    return error
    else 
	assert f.puissance ( 0 , 0 ) == 0
	assert f.puissance ( 1, -2 ) == 1
	assert f.puissance ( 1 , 2 ) == 1
	assert f.puissance ( 2 , 2 ) == 4
	assert f.puissance ( 2, -2 ) == 1
